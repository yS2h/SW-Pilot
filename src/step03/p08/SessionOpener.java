package step03.p08;

import java.time.LocalDateTime;

public interface SessionOpener {
    Session openSession(LocalDateTime date, String place);
}
