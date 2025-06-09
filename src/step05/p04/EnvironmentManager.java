package step05.p04;

import java.io.*;
import java.util.Scanner;

public class EnvironmentManager {
    private String fileName = "environment_data.txt";
    private String path;

    public EnvironmentManager(String path) {
        this.path = path + fileName;
    }

    public boolean saveData(Scanner scanner) {
        try {
            System.out.print("온도를 입력하세요: ");
            double temperature = Double.parseDouble(scanner.nextLine());

            System.out.print("습도를 입력하세요: ");
            double humidity = Double.parseDouble(scanner.nextLine());

            System.out.print("산소 농도를 입력하세요: ");
            double oxygen = Double.parseDouble(scanner.nextLine());

            System.out.print("측정 장소를 입력하세요: ");
            String place = scanner.nextLine();

            EnvironmentInfo info = new EnvironmentInfo(temperature, humidity, oxygen, place);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                writer.write(info.writeFormat());
                writer.newLine();
            }
            System.out.println("데이터가 " + fileName + "에 저장되었습니다.");
            return true;
        } catch (NumberFormatException e) {
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void print() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
