package step05.p03;

public class ResearchLog {
    private String name;
    private String content;

    public ResearchLog(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void print() {
        System.out.println(content);
    }
}
