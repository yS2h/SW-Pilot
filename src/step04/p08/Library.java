package step04.p08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        System.out.println("도서관 시스템이 생성되었습니다.");
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("\"" + book.getTitle() + "\"가 도서 목록에 추가되었습니다.");
    }

    public void loanBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("존재하지 않는 책입니다.");
            return;
        }
        if (!book.isLoanable()) {
            System.out.println("\"" + title + "\"가 이미 대출 중입니다.");
        }
        book.loanBook();
        System.out.println("\"" + title + "\" 대출되었습니다. 최근 대출 날짜 업데이트: " + book.getLastLoanDate());
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("존재하지 않는 책입니다.");
            return;
        }
        book.returnBook();
        System.out.println("\"" + title + "\" 반납되었습니다.");
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public void printSortedBooks(Comparator<Book> comparator) {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(comparator);
        for (Book b : sortedBooks) {
            System.out.println(b.toString());
        }
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title))
                return b;
        }
        return null;
    }
}
