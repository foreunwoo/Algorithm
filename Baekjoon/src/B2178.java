import java.util.*;

public class B2178 {
    static int[] dx = {0, 1, 0, -1}; // 우하좌상
    static int[] dy = {1, 0, -1, 0};
    public static int n, m;
    public static int map[][];
    public static boolean visit[][];

    public static void bfs(int x, int y) {
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();

        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty() && !qy.isEmpty()) {
            x = qx.poll();
            y = qy.poll();
            visit[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int _x = x + dx[i];
                int _y = y + dy[i];

                if (_x >= 0 && _y >= 0 && _x < n && _y < m) {
                    if (map[_x][_y] == 1 && visit[_x][_y] == false) {
                        qx.add(_x);
                        qy.add(_y);

                        visit[_x][_y] = true;
                        map[_x][_y] = map[x][y] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[100][100];
        visit = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = temp.charAt(j) - 48;
            }
        }

        bfs(0, 0);
        System.out.print(map[n - 1][m - 1]);
    }
}




