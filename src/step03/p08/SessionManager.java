package step03.p08;

import java.time.LocalDateTime;

public interface SessionManager {
    void cancelSession(Session session);

    void delaySession(Session session, LocalDateTime date);
}
