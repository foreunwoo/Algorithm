import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1012 {
    private static final int[] dx = {0,0,1,-1};
    private static final int[] dy = {1,-1,0,0};
    private static int m, n;
    private static int [][] map = new int[25][25];
    private static boolean [][] visited = new boolean[25][25];

    public static void bfs(int x, int y) {
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int curX = q.peek()[0];
            int curY = q.peek()[1];
            q.poll();

            for (int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 갯수
        int cnt; // 배추 수

        while (t != 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            cnt = sc.nextInt();

            map = new int[m][n];
            visited = new boolean[m][n];
            int worm = 0; // 지렁이 수

            for (int i=0; i<cnt; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                map[a][b] = 1;
            }

            for (int x=0; x<m; x++) {
                for (int y=0; y<n; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        bfs(x, y);
                        worm++;
                    }
                }
            }

            System.out.println(worm);
            t--;
        }

        sc.close();
    }
}
