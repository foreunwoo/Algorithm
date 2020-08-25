import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 총 회의의 수

        int [][] arr = new int[n+1][2];

        int count = 0;
        int end = -1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                if (arr1[1] == arr2[1]) {
                    return arr1[0] - arr2[0];
                } else {
                    return arr1[1] - arr2[1];
                }
            }
        });

        for(int i=0; i<n; i++) {
            if(arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}