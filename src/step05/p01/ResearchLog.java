package step05.p01;

public class ResearchLog {
    private String name;
    private String content;

    public ResearchLog(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void print() {
        System.out.println("→ " + content);
    }
}
