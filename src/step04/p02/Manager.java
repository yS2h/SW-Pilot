package step04.p02;

class Manager extends User implements Managable {
    public Manager(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void addBook(Library library, Book book) {
        System.out.println(getName() + "이(가) 책을 추가합니다: " + book.getBookInfo());
        library.addBook(book);
    }

    @Override
    public void removeBook(Library library, Book book) {
        if (book.isBorrowed()) {
            System.out.println("'" + book.getTitle() + "'은(는) 대출 중이라 삭제가 불가능합니다.");
        }
        System.out.print(getName() + "이(가) 책을 삭제합니다: " + book.getBookInfo());
        library.removeBook(book);
    }

    @Override
    public String getName() {
        return "관리자 '" + super.getName() + "'";
    }
}
