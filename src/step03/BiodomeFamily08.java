package step03;

import java.time.LocalDateTime;

public class BiodomeFamily08 {
    public static void main(String[] args) {
        Club c = new Club();

        Manager john = new Manager("John", LocalDateTime.now());
        GeneralMember jane = new GeneralMember("Jane", LocalDateTime.now());
        GeneralMember doe = new GeneralMember("Doe", LocalDateTime.now());
        NewMember amy = new NewMember("Amy", LocalDateTime.now());
        NewMember leo = new NewMember("Leo", LocalDateTime.now());

        c.addMember(john);
        c.addMember(jane);
        c.addMember(doe);
        c.addMember(amy);
        c.addMember(leo);

        Session s = john.openSession(LocalDateTime.of(2130, 9, 12, 0, 0), "도메 스타디움");
        c.addSession(s);

        jane.participate(s);
        amy.participate(s);

        c.delaySessionBySearch("도메 스타디움", LocalDateTime.of(2130, 9, 19, 18, 0), john);
        c.cancleSessionBySearch(LocalDateTime.of(2130, 9, 19, 0, 0), john);
    }
}
