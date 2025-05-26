package step03.p08;

import java.time.LocalDateTime;

public class GeneralMember extends Member implements SessionOpener {
    public GeneralMember(String name, LocalDateTime date, String skill) {
        super(name, date, skill);
        System.out.println(name + "이 일반 멤버로 가입되었습니다.");
    }

    public GeneralMember(String name, LocalDateTime date) {
        super(name, date);
        System.out.println(name + "이 일반 멤버로 가입되었습니다.");
    }

    @Override
    public Session openSession(LocalDateTime date, String place) {
        Session session = new Session(date, place, this, true);
        System.out.println(getName() + "이 " + date.toLocalDate() + ", " + place + "에 연습 세션을 오픈했습니다.");
        return session;
    }
}
