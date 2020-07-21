package round658;
import java.util.*;

public class Question1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0;i < n;i++) {
			set.add(sc.nextInt());
		}
		boolean flag = false;
		int ixi = -1;
		for(int i = 0;i< m;i++) {
			int ix = sc.nextInt();
			if(set.contains(ix)) {
				flag = true;
				ixi = ix;
			}
		}
		
		if(flag) {
			System.out.println("YES");
			System.out.println(1 + " " + ixi);
		}
		else System.out.println("NO");
		
		
	}
}
