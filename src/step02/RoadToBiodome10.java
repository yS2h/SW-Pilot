package step02;

public class RoadToBiodome10 {

    static final int MAX = 100;
    static int[][] graph = new int[MAX][MAX];
    static boolean[] visited = new boolean[MAX];

    public static void main(String[] args) {
        try {
            for (String s : args) {
                String[] plant = s.split(",");

                int a = Integer.parseInt(plant[0]);
                int b = Integer.parseInt(plant[1]);

                if (a < 1 || a > MAX || b < 1 || b > MAX) {
                    System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
                    return;
                }

                graph[a][b] = 1;
                graph[b][a] = 1;
            }

            int cnt = 0;
            for (int i = 1; i < MAX; i++) {
                if (!visited[i]) {
                    boolean connected = false;

                    for (int j = 1; j < MAX; j++) {
                        if (graph[i][j] == 1) {
                            connected = true;
                            break;
                        }
                    }

                    if (connected) {
                        dfs(i);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
        }
    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int i = 1; i < MAX; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
