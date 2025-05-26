package step03.p08;

import java.time.LocalDateTime;

public class NewMember extends Member {
    public NewMember(String name, LocalDateTime date, String skill) {
        super(name, date, skill);
        System.out.println(name + "이 신규 멤버로 가입되었습니다.");
    }

    public NewMember(String name, LocalDateTime date) {
        super(name, date);
        System.out.println(name + "이 신규 멤버로 가입되었습니다.");
    }
}
