package step05.p09;

import java.util.Scanner;

public class BiodomeForever09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DuplicateSearcher d = new DuplicateSearcher();

        System.out.println("중복 파일 검색기에 오신 걸 환영합니다.");
        System.out.print("탐색할 폴더를 입력하세요: ");
        String path = sc.nextLine();

        try {
            d.findDuplicate(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
