package step05.p02;

public class BiodomeForever02 {
    public static void main(String[] args) {
        ResearchLogManager manager = new ResearchLogManager();

        for (String fileName : args) {
            ResearchLog log = manager.load(fileName);
            if (log != null) {
                log.parseDate();
                log.print();
            }
        }
    }
}
