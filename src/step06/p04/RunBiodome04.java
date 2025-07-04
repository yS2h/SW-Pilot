package step06.p04;

import java.util.Scanner;

public class RunBiodome04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitStore fs = new FruitStore();

        System.out.println("과일 상점에 오신 것을 환영합니다!\n");

        while (true) {
            System.out.println("1. 모든 과일 재고 조회하기");
            System.out.println("2. 가장 많이 팔린 과일 조회하기");
            System.out.println("3. 총 판매 과일 수 조회하기");
            System.out.println("4. 과일별 평균 판매 개수 조회하기");
            System.out.println("5. 종료하기");
            System.out.print("\n메뉴를 선택하세요: ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    fs.showAllStock();
                    break;
                case "2":
                    fs.showTopSeller();
                    break;
                case "3":
                    fs.showTotalSold();
                    break;
                case "4":
                    fs.showAveragePerFruit();
                    break;
                case "5":
                    System.out.println("\n과일 상점 관리 시스템을 종료합니다!");
                    return;
                default:
                    System.out.println("\n존재하지 않는 메뉴입니다. 1번에서 5번을 선택해주세요.\n");
            }
        }
    }
}
