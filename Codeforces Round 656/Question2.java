package round656;
import java.util.*;
import java.io.*;
//AC
public class Question2 {
static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i < 2 * n;i++) {
			int x = sc.nextInt();
			if(!set.contains(x)) {
				System.out.print(x + " ");
				
			}
			set.add(x);
			
		}
		
		System.out.println();
	}
}
