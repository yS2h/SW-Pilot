package step04.p02;

class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getBookInfo() {
        return "'" + title + "', '" + author + "'";
    }

    public void printBookInfo() {
        if (isBorrowed)
            System.out.println(title + ", 대출 불가");
        else
            System.out.println(title + ", 대출 가능");
    }
}
