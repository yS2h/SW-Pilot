package step05.p06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResearcherManager {
    private final List<Researcher> researchers = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final File dataFile;

    public ResearcherManager() {
        String basePath = System.getProperty("user.dir");
        this.dataFile = new File(basePath + "/src/step05/p06/researchers_data.txt");
    }

    public void register() {
        System.out.print("연구원의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("연구원의 담당 위치를 입력하세요: ");
        String location = scanner.nextLine();

        Researcher researcher = new Researcher(name, location);
        researchers.add(researcher);

        try (FileWriter writer = new FileWriter(dataFile, true)) {
            writer.write(researcher.toString() + "\n");
            System.out.println("연구원 정보가 성공적으로 등록되었습니다!\n생성된 연구원 ID: " + researcher.getId());
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("\n전체 연구원 목록:");
        System.out.println("====================================");

        if (!dataFile.exists()) {
            System.out.println("등록된 연구원이 없습니다.");
            return;
        }

        try (Scanner fileScanner = new Scanner(dataFile)) {
            int count = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(++count + ". " + line);
            }

            if (count == 0) {
                System.out.println("등록된 연구원이 없습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }

    public void search() {
        System.out.print("검색할 연구원의 ID를 입력하세요: ");
        String input = scanner.nextLine().trim();

        if (!input.matches("LUMI-\\d{4}-\\d{2}:\\d{3}")) {
            System.out.println("잘못된 ID 형식입니다.");
            return;
        }

        if (!dataFile.exists()) {
            System.out.println("아직 등록된 연구원이 없습니다.");
            return;
        }

        boolean found = false;

        try (Scanner fileScanner = new Scanner(dataFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.startsWith(input)) {
                    System.out.println("연구원 정보:\n" + line);
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }

        if (!found) {
            System.out.println("에러: 해당 ID를 가진 연구원 정보가 존재하지 않습니다");
        }
    }
}
