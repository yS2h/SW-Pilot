package step04.p08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private LocalDate publishDate;
    private boolean isLoanable;
    private LocalDate lastLoanDate;

    public Book(String title, String author, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.isLoanable = true;
        this.lastLoanDate = null;
        System.out.println(toString());
    }

    public void loanBook() {
        this.isLoanable = false;
        this.lastLoanDate = LocalDate.now();
    }

    public void returnBook() {
        this.isLoanable = true;
    }

    public boolean isLoanable() {
        return this.isLoanable;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getPublishDateFormatted() {
        return publishDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getLastLoanDate() {
        if (lastLoanDate == null)
            return "N/A";
        else
            return lastLoanDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String toString() {
        return "제목: \"" + title + ",\" 저자: " + author + ",\" 출판일: \"" + getPublishDateFormatted() + "\", 대출 가능 여부: \"" + (isLoanable ? "가능" : "불가능") + "\", 최근 대출 날짜: \"" + getLastLoanDate() + "\"";
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    public static class ByAuthor implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    }

    public static class ByPublishDate implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getPublishDate().compareTo(b2.getPublishDate());
        }
    }
}
