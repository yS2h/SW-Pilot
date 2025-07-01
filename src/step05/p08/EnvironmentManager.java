package step05.p08;

import java.io.*;

public class EnvironmentManager {
    private final String path;
    private final BinarySearchTree bst = new BinarySearchTree();

    public EnvironmentManager(String path) {
        this.path = path;
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                EnvironmentInfo info = EnvironmentInfo.fromLine(line);
                if (info != null) bst.insert(info);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    public EnvironmentInfo search(String date) {
        Node node = bst.search(date);
        return node != null ? node.getInfo() : null;
    }

    public boolean update(String date, double oxygen, double humidity, double temperature) {
        Node node = bst.search(date);
        if (node != null) {
            EnvironmentInfo info = node.getInfo();
            info.setOxygen(oxygen);
            info.setHumidity(humidity);
            info.setTemperature(temperature);
            return true;
        }
        return false;
    }

    public void save() {
        StringBuilder builder = new StringBuilder();
        bst.writeInOrder(builder);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(builder.toString());
        } catch (IOException e) {
            System.out.println("파일 저장 오류: " + e.getMessage());
        }
    }
}
