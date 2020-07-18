package round656;
import java.util.*;
import java.io.*;
//AC
public class Question1 {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		boolean flag = false;
		
		if(x == y && z < x)flag = true;
		else if(y == z && x < y)flag = true;
		else if(z == x && y < x)flag = true;
		else if(x == y && y == z)flag = true;
		
		if(!flag) {
			System.out.println(-1);
			return;
		}
		
		int[] c = {x, y, z};
		Arrays.sort(c);
		
		System.out.println(c[0] + " " + c[0] + " " + c[2]);
		
	}
}
