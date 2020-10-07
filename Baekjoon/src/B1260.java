import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260 {
    static int N, M, V, x, y;
    static int [] visit = new int[1001];
    static int [][] mat = new int[1001][1001];
    static Queue<Integer> q = new LinkedList<Integer>();

    static void dfs(int V) {
        visit[V] = 1;
        System.out.print(V + " ");
        for(int i=1; i<=N; i++) {
            if(visit[i] == 1 || mat[V][i] == 0)
                continue;
            dfs(i);
        }
    }

    static void bfs(int V) {
        visit[V] = 0;
        q.offer(V);

        while(!q.isEmpty()) {
            V = q.poll();
            System.out.print(V + " ");

            for(int i=1; i<=N; i++) {
                if(visit[i] == 0 || mat[V][i] == 0)
                    continue;
                q.offer(i);
                visit[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        for(int i=1; i<=M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            mat[x][y] = mat[y][x] = 1;
        }

        dfs(V);
        System.out.println("");
        bfs(V);
    }
}
