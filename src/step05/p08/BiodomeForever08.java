package step05.p08;

import java.util.Scanner;

public class BiodomeForever08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "src/step05/p08/environment_data_Lake.txt";
        EnvironmentManager manager = new EnvironmentManager(path);

        System.out.println("환경 데이터 검색 및 수정 프로그램에 오신 것을 환영합니다!");
        manager.load();

        System.out.print("검색하고 싶은 날짜를 입력하세요: ");
        String inputDate = scanner.nextLine();

        EnvironmentInfo info = manager.search(inputDate);
        if (info == null) {
            System.out.println("\n→ 해당 날짜의 데이터는 존재하지 않습니다.");
            return;
        }

        System.out.println("\n→ 검색 결과: " + info);
        System.out.print("데이터를 수정하시겠습니까? (Y/N): ");
        String answer = scanner.nextLine().trim().toUpperCase();

        if (answer.equals("Y")) {
            System.out.print("새로운 데이터 값을 입력하세요: ");
            try {
                String[] input = scanner.nextLine().split(",");
                double oxygen = Double.parseDouble(input[0]);
                double humidity = Double.parseDouble(input[1]);
                double temperature = Double.parseDouble(input[2]);

                if (manager.update(inputDate, oxygen, humidity, temperature)) {
                    manager.save();
                    System.out.println("\n→ 데이터 수정 완료!");
                    System.out.println("날짜 " + inputDate + ", 수정된 데이터 " + oxygen + "," + humidity + "," + temperature);
                }
            } catch (Exception e) {
                System.out.println("\n→ 입력 형식이 잘못되었습니다.");
            }
        } else {
            System.out.println("\n→ 수정이 취소되었습니다.");
        }

        scanner.close();
    }
}
