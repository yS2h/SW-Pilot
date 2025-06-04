package step05.p01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ResearchLogManager {

    public ResearchLog load(String name) {
        String path = "D:\\SWPilot\\src\\step05\\p01\\" + name;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            byte[] buf = new byte[fis.available()];
            fis.read(buf);
            return new ResearchLog(name, new String(buf));
        } catch (FileNotFoundException e) {
            System.out.println("→ 존재하지 않는 파일입니다. 파일 이름을 다시 확인해주세요.");
        } catch (IOException e) {
            System.out.println("→ 오류가 발생했습니다.");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("→ 오류가 발생했습니다.");
                }
            }
        }
        
        return null;
    }
}
