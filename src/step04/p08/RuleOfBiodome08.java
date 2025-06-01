package step04.p08;

import java.time.LocalDate;

public class RuleOfBiodome08 {
    public static void main(String[] args) {
        System.out.println("(도서 객체 생성)");
        Book b1 = new Book("파이썬 마스터", "한송희", LocalDate.of(2020, 1, 1));
        Book b2 = new Book("자바의 구름", "제임스밥", LocalDate.of(2018, 5, 5));
        Book b3 = new Book("에너지 플로우", "키네틱스", LocalDate.of(2019, 8, 15));
        Book b4 = new Book("화성에서의 기억", "한송희", LocalDate.of(2021, 3, 3));
        Book b5 = new Book("야채의 비밀", "송은정", LocalDate.of(2017, 10, 10));

        System.out.println("\n(도서관 시스템 생성 및 등록)");
        Library l = new Library();
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);

        System.out.println("\n(대출)");
        l.loanBook("야채의 비밀");
        l.loanBook("화성에서의 기억");

        System.out.println("\n(반납)");
        l.returnBook("야채의 비밀");

        System.out.println("\n(도서 조회 결과)");
        l.printBooks();

        System.out.println("\n(저자 기반 정렬 조회)");
        l.printSortedBooks(new Book.ByAuthor());

        System.out.println("\n(출판일 기반 정렬 조회)");
        l.printSortedBooks(new Book.ByPublishDate());

    }
}
