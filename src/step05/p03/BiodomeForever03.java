package step05.p03;

import java.io.FileNotFoundException;

public class BiodomeForever03 {
    public static void main(String[] args) {
        String dir = "D:\\SWPilot\\src\\step05\\p03\\";
        ResearchLogManager manager = null;
        try {
            manager = new ResearchLogManager(dir);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ResearchLogManager.NoDataAvailableException e) {
            throw new RuntimeException(e);
        }
        manager.writeFile(dir);
    }
}
