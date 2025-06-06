package step05.p02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResearchLog {
    private String name;
    private String content;

    public ResearchLog(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void parseDate() {
        String s = this.name.substring(0, 12);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
        try {
            Date date = formatter.parse(s);
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            System.out.println("→ " + formatter.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("\n→ 파일 이름에서 날짜를 확인할 수 없습니다.");
            throw new RuntimeException(e);
        }
    }

    public void print() {
        System.out.println(content);
    }
}
