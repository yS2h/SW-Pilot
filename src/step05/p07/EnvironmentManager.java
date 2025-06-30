package step05.p07;

import java.io.RandomAccessFile;
import java.io.IOException;

public class EnvironmentManager {
    private String path;

    public EnvironmentManager(String path) {
        this.path = path;
    }

    public EnvironmentInfo search(String inputDateTime) {
        try (RandomAccessFile raf = new RandomAccessFile(path, "r")) {
            String line;
            while ((line = raf.readLine()) != null) {
                if (line.startsWith(inputDateTime)) {
                    return EnvironmentInfo.fromLine(line);
                }
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
        return null;
    }
}
