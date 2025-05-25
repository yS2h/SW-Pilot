package step03;

import java.time.LocalDateTime;

public class Manager extends Member implements SessionManager, SessionOpener {
    public Manager(String name, LocalDateTime date, String skill) {
        super(name, date, skill);
        System.out.println(name + "이 운영진으로 가입되었습니다.");
    }

    public Manager(String name, LocalDateTime date) {
        super(name, date);
        System.out.println(name + "이 운영진으로 가입되었습니다.");
    }

    @Override
    public Session openSession(LocalDateTime date, String place) {
        Session session = new Session(date, place, this, true);
        System.out.println(getName() + "이 " + date.toLocalDate() + ", " + place + "에 연습 세션을 오픈했습니다.");
        return session;
    }

    @Override
    public void cancelSession(Session session) {
        session.setState(false);
        System.out.println(session.getDate().toLocalDate() + ", " + session.getPlace() + "연습 세션이 취소되었습니다.");
    }

    @Override
    public void delaySession(Session session, LocalDateTime date) {
        session.setDate(date);
        System.out.println(getName() + "이 " + session.getDate().toLocalDate() + ", " + session.getPlace() + "에 연습 세션을 연기했습니다.");
    }
}
