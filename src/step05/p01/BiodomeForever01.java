package step05.p01;

public class BiodomeForever01 {
    public static void main(String[] args) {
        ResearchLogManager manager = new ResearchLogManager();

        for (String fileName : args) {
            ResearchLog log = manager.load(fileName);
            if (log != null) {
                log.print();
            }
        }
    }
}
