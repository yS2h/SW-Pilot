package step01;

public class HelloBiodome01 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("사용자 이름을 입력해 주세요");
            return;
        }
        String name = String.join(" ", args);
        System.out.println(name + "님 안녕하세요!");
    }
}