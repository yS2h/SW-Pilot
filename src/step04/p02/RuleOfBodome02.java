package step04.p02;


public class RuleOfBodome02 {
    public static void main(String[] args) {
        Library library = new Library();

        Manager seiko = new Manager("U001", "세이코");
        Member merry = new Member("U002", "메리");
        Member manok = new Member("U003", "만옥");

        library.addUser(seiko);
        library.addUser(merry);
        library.addUser(manok);
        System.out.println();

        seiko.addBook(library, new Book("B001", "자바의 구름", "제임스밥"));
        seiko.addBook(library, new Book("B002", "파이썬 마스터", "한송희"));
        seiko.addBook(library, new Book("B003", "에너지 플로우", "키네틱스"));
        seiko.addBook(library, new Book("B004", "화성에서의 기억", "한송희"));
        seiko.addBook(library, new Book("B005", "야채의 비밀", "송은정"));
        System.out.println();

        merry.borrowBook(library.findBook("B001"));
        System.out.println();

        seiko.addBook(library, new Book("B006", "자료구조의 언덕", "황수"));
        seiko.addBook(library, new Book("B007", "그곳에 가면", "한송희"));
        System.out.println();

        manok.borrowBook(library.findBook("B001"));
        merry.returnBook(library.findBook("B001"));
        seiko.borrowBook(library.findBook("B004"));
        System.out.println();

        library.findBookByAuthor("한송희");
    }
}
