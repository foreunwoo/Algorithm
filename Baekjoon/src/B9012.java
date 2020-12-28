import java.util.Scanner;
import java.util.Stack;

public class B9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            String str = sc.next();
            Stack<Character> s = new Stack<>();

            char temp;
            boolean isVps = true;
            for (int i=0; i<str.length(); i++) {
                temp = str.charAt(i);

                if (temp == '(') { // 여는 괄호일 경우 푸시
                    s.push(temp);
                } else if (temp == ')') { // 닫는 괄호일 경우 조건 검사
                    if (!s.isEmpty()) { // 스택이 비어있지 않고 여는 괄호가 들어있을 경우 pop
                        s.pop();
                    } else {
                        isVps = false;
                        break;
                    }
                }
            }

            if (!s.isEmpty()) isVps = false;

            if (isVps) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}
