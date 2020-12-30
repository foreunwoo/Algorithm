import java.util.*;

public class B1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int n = sc.nextInt();
        while (n > 0) {
            int x = sc.nextInt();
            if (x != 0) {
                q.add(x);
            } else if (!q.isEmpty() && x == 0) {
                System.out.println(q.poll());
            } else {
                System.out.println(0);
            }

            n--;
        }
    }
}
