package step05.p05;

import java.io.*;
import java.util.*;

public class EnvironmentManager {
    private final File dataFile;

    public EnvironmentManager() {
        String basePath = System.getProperty("user.dir");
        this.dataFile = new File(basePath + "/src/step05/p05/environment_data.ser");
    }

    public boolean saveData(Scanner scanner) {
        try {
            System.out.print("온도를 입력하세요: ");
            double temperature = Double.parseDouble(scanner.nextLine());

            System.out.print("습도를 입력하세요: ");
            double humidity = Double.parseDouble(scanner.nextLine());

            System.out.print("산소 농도를 입력하세요: ");
            double oxygen = Double.parseDouble(scanner.nextLine());

            System.out.print("위치를 입력하세요: ");
            String place = scanner.nextLine();

            EnvironmentInfo info = new EnvironmentInfo(temperature, humidity, oxygen, place);
            List<EnvironmentInfo> list = loadAllData();
            list.add(info);
            saveAllData(list);

            System.out.println("데이터가 성공적으로 저장되었습니다.");
            return true;
        } catch (NumberFormatException e) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<EnvironmentInfo> loadAllData() {
        if (!dataFile.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
            return (List<EnvironmentInfo>) ois.readObject();
        } catch (Exception e) {
            System.out.println("파일 불러오기 오류: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private void saveAllData(List<EnvironmentInfo> data) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(data);
        }
    }

    public void print() {
        List<EnvironmentInfo> list = loadAllData();
        if (list.isEmpty()) {
            System.out.println("저장된 데이터가 없습니다.");
        } else {
            for (EnvironmentInfo info : list) {
                System.out.println(info);
            }
        }
    }

    public void printByDate() {
        List<EnvironmentInfo> list = loadAllData();
        if (list.isEmpty()) {
            System.out.println("저장된 데이터가 없습니다.");
        } else {
            System.out.println("날짜별 생명지수:");
            for (EnvironmentInfo info : list) {
                double H = EnvironmentAnalysis.calculate(info);
                System.out.printf("%s, %s: %.2f\n", info.getTime(), info.getPlace(), H);
            }
        }
    }
}
