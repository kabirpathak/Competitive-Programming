package round658;
import java.util.*;

public class Question2 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		while(arr[i] == 1) {
			i++;
			if(i >= n)break;
		}
		
		
		if(i >= n) {
			if(n % 2 == 0) {
				System.out.println("Second");
				
			}
			else System.out.println("First");
			return;
		}
		
		String ans = "First";
		if(i % 2 == 1) {
			ans = "Second";
		}
		
		System.out.println(ans);
	}
}
