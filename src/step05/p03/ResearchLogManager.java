package step05.p03;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class ResearchLogManager {
    private List<ResearchLog> logList;

    public ResearchLogManager(String directory) throws FileNotFoundException, NoDataAvailableException {
        logList = new ArrayList<>();
        File currentdir = new File(directory);

        if (!currentdir.exists() || !currentdir.isDirectory()) {
            throw new FileNotFoundException("폴더 경로가 잘못되었습니다");
        }

        File[] files = currentdir.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            throw new NoDataAvailableException("분석할 파일이 없습니다.");
        }

        for (File file : files) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] data = fis.readAllBytes();
                String content = new String(data);
                String name = file.getName();

                if (name.contains("Lumino"))
                    continue;

                String prefix = name.substring(0, 12);
                SimpleDateFormat dateCheck = new SimpleDateFormat("yyyyMMddHHmm");
                dateCheck.setLenient(false);
                try {
                    dateCheck.parse(prefix);
                } catch (Exception e) {
                    continue;
                }

                ResearchLog log = new ResearchLog(name, content);
                logList.add(log);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile(String directory) {
        List<String> extracted = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String time = sdf.format(new Date());

        for (ResearchLog log : logList) {
            try {
                String content = log.getContent();
                String name = extract(content, "Name.", "\n");
                String adr = extract(content, "ADR.", "\n");

                if (name == null || adr == null) {
                    throw new InvalidLogFormatException("Name 또는 ADR 누락됨");
                }

                extracted.add(name.trim() + " - " + adr.trim());

            } catch (InvalidLogFormatException e) {
                e.printStackTrace();
            }
        }

        File file = new File(directory + File.separator + time + "_Lumino_ADR.txt");

        if (file.exists()) {
            sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            time = sdf.format(new Date());
            file = new File(directory + File.separator + time + "_Lumino_ADR.txt");
        }

        try (FileOutputStream fos = new FileOutputStream(file)) {
            for (String s : extracted) {
                fos.write((s + System.lineSeparator()).getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String extract(String content, String start, String end) {
        int startIdx = content.indexOf(start);
        if (startIdx == -1) return null;

        int endIdx = content.indexOf(end, startIdx + start.length());
        if (endIdx == -1) return null;

        return content.substring(startIdx + start.length(), endIdx).trim();
    }

    public static class InvalidLogFormatException extends Exception {
        public InvalidLogFormatException(String message) {
            super(message);
        }
    }

    public static class NoDataAvailableException extends Exception {
        public NoDataAvailableException(String message) {
            super(message);
        }
    }
}
