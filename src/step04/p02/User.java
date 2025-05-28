package step04.p02;

import java.util.ArrayList;
import java.util.List;

abstract class User {
    private String userId;
    private String name;
    private List<Book> borrowBooks = new ArrayList<>();

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isBorrowed()) {
            System.out.println("'" + book.getTitle() + "'은 대출 중입니다.");
            return;
        }
        System.out.println(getName() + "이(가) '" + book.getTitle() + "' 대출합니다.");
        book.setBorrowed(true);
        borrowBooks.add(book);
    }

    public void returnBook(Book book) {
        if (!book.isBorrowed()) {
            System.out.println("등록되지 않은 책입니다.");
            return;
        }
        System.out.println(getName() + "이(가) '" + book.getTitle() + "' 반납합니다.");
        book.setBorrowed(false);
        borrowBooks.remove(book);
    }

    public String getName() {
        return name;
    }
}
