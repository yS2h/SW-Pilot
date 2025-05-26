package step03.p08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Member> memberList = new ArrayList<>();
    private List<Session> sessionList = new ArrayList<>();

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void addSession(Session session) {
        sessionList.add(session);
    }

    public void removeMember(Member member) {
        memberList.remove(member);
    }

    public void removeSession(Session session) {
        sessionList.remove(session);
    }

    public void cancleSessionBySearch(LocalDateTime date, Manager manager) {
        Session session = findSession(date);
        if (session != null) {
            manager.cancelSession(session);
        } else {
            System.out.println("날짜에 해당하는 세션이 없습니다.");
        }
    }

    public void cancleSessionBySearch(String place, Manager manager) {
        Session session = findSession(place);
        if (session != null) {
            manager.cancelSession(session);
        } else {
            System.out.println("장소에 해당하는 세션이 없습니다.");
        }
    }

    public void delaySessionBySearch(LocalDateTime date, LocalDateTime newDate, Manager manager) {
        Session session = findSession(date);
        if (session != null) {
            manager.delaySession(session, newDate);
        } else {
            System.out.println("날짜에 해당하는 세션이 없습니다.");
        }
    }

    public void delaySessionBySearch(String place, LocalDateTime newDate, Manager manager) {
        Session session = findSession(place);
        if (session != null) {
            manager.delaySession(session, newDate);
        } else {
            System.out.println("장소에 해당하는 세션이 없습니다.");
        }
    }

    public Session findSession(LocalDateTime date) {
        for (Session s : sessionList) {
            if (s.getDate().toLocalDate().equals(date.toLocalDate())) {
                return s;
            }
        }
        return null;
    }

    public Session findSession(String place) {
        for (Session s : sessionList) {
            if (s.getPlace().equals(place)) {
                return s;
            }
        }
        return null;
    }

    public void printMember() {
        for (Member m : memberList) {
            System.out.println(m.getName());
        }
    }

    public void printSession() {
        for (Session s : sessionList) {
            System.out.println(s);
        }
    }

    public List<Session> searchByDate(LocalDateTime date) {
        List<Session> result = new ArrayList<>();
        for (Session s : sessionList) {
            if (s.getDate().toLocalDate().equals(date.toLocalDate())) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Session> searchByStatus(Boolean state) {
        List<Session> result = new ArrayList<>();
        for (Session s : sessionList) {
            if (s.getState() == state) {
                result.add(s);
            }
        }
        return result;
    }
}
