import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2606 {
    static int [][] node;
    static boolean [] visited;

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        int cnt = 0; // 감염된 컴퓨터의 수
        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i=1; i<node.length; i++) {
                if (node[x][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점 수
        int m = sc.nextInt(); // 간선 수
        int a,b;

        node = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i=0; i<m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            node[a][b] = 1;
            node[b][a] = 1;
        }

        bfs(1);
        sc.close();
    }
}
