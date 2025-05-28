package step04.p02;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("새로운 " + user.getName() + "를 등록합니다.");
    }

    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn))
                return book;
        }
        System.out.println("검색 결과 해당하는 책이 없습니다.");
        return null;
    }

    public void findBookByAuthor(String author) {
        System.out.println("저자 '" + author + "'의 책 목록:");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.print("-");
                book.printBookInfo();
            }
        }
    }
}
