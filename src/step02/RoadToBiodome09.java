package step02;

import java.util.LinkedList;
import java.util.Queue;

public class RoadToBiodome09 {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        int N = args.length;
        int M = args[0].length();

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int n = args[i].charAt(j) - '0';
                if (n != 0 && n != 1 || args[i].length() != M) {
                    System.out.println("입력값이 0또는 1인 2차원 배열을 입력해 주세요.");
                    return;
                }
                map[i][j] = n;
            }
        }
        System.out.println(BFS(map, N, M));
    }

    public static int BFS(int[][] map, int N, int M) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;
        q.add(new int[]{0, 0, 0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cnt = cur[2];

            if (cur[0] == N - 1 && cur[1] == M - 1) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, cnt + 1});
                }
            }
        }
        return -1;
    }
}
