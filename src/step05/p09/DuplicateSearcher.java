package step05.p09;

import java.io.*;
import java.util.*;

public class DuplicateSearcher {
    public List<File> getFiles(String folderPath) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IOException("올바르지 않은 경로입니다.");
        }

        File[] files = folder.listFiles(File::isFile);
        if (files == null) {
            throw new IOException("폴더를 읽을 수 없습니다.");
        }

        return Arrays.asList(files);
    }

    public boolean isSame(File file1, File file2) throws IOException {
        if (file1.length() != file2.length()) return false;

        try (InputStream in1 = new BufferedInputStream(new FileInputStream(file1));
             InputStream in2 = new BufferedInputStream(new FileInputStream(file2))) {

            int b1, b2;
            while ((b1 = in1.read()) != -1) {
                b2 = in2.read();
                if (b1 != b2) return false;
            }
        }
        return true;
    }

    public void findDuplicate(String folderPath) throws IOException {
        List<File> files = getFiles(folderPath);
        boolean foundDuplicate = false;

        System.out.println("\n→ 탐색 결과\n");

        for (int i = 0; i < files.size(); i++) {
            for (int j = i + 1; j < files.size(); j++) {
                if (isSame(files.get(i), files.get(j))) {
                    System.out.println(files.get(i).getName() + " 파일과 " + files.get(j).getName() + " 파일은 동일한 파일입니다.");
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("중복된 파일이 없습니다.");
        }
    }
}
