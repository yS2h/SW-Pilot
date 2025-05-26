package step03.p08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private LocalDateTime date;
    private String place;
    private Member opener;
    private Boolean state;
    private List<Member> memberList = new ArrayList<>();

    public Session(LocalDateTime date, String place, Member opener, Boolean state) {
        this.date = date;
        this.place = place;
        this.opener = opener;
        this.state = state;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getPlace() {
        return place;
    }

    public void addMember(Member member) {
        memberList.add(member);
    }
}
