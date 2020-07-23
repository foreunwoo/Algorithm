import java.util.Scanner;

public class P2750 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		int [] a= new int[n];
		
		for(int i=0; i<n; i++) {
			int n2 = scan.nextInt();
			a[i] = n2;
		}

		int tmp = 0;
		for(int x=0; x<a.length-1; x++) {
			for(int y=x+1; y<a.length; y++) {
				if(a[x] > a[y]) {
					tmp = a[x];
					a[x] = a[y];
					a[y] = tmp;
				}
			}
		}
		
		for(int k=0; k<n; k++)
			System.out.println(a[k]);
		
		scan.close();
	}

}
