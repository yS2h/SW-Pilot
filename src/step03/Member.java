package step03;

import java.time.LocalDateTime;

public abstract class Member {
    private final String name;
    private LocalDateTime date;
    private String skill;

    public Member(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
        this.skill = "";
    }

    public Member(String name, LocalDateTime date, String skill) {
        this.name = name;
        this.date = date;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void participate(Session session) {
        session.addMember(this);
        System.out.println(name + "이 연습 세션에 참가합니다.");
    }

}
