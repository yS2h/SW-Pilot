package step06.p03;

import java.util.Scanner;

public class RunBiodome03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitStore fc = new FruitStore();

        System.out.println("과일 상점에 오신 것을 환영합니다!");

        while (true) {
            System.out.println("1. 과일 판매하기");
            System.out.println("2. 과일 재고 추가하기");
            System.out.println("3. 모든 과일 재고 조회하기");
            System.out.println("4. 종료하기");
            System.out.print("\n메뉴를 선택하세요: ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    fc.sellFruit(sc);
                    break;
                case "2":
                    fc.addStock(sc);
                    break;
                case "3":
                    fc.showAllStock();
                    break;
                case "4":
                    fc.saveData();
                    return;
                default:
                    System.out.println("1번에서 4번 메뉴를 선택해주세요.");
            }
        }
    }
}
