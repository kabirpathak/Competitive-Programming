package codechefCookOffJuly;
import java.util.*;
import java.io.*;
//O(n^2) 
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
		
		long val = 0;
		long[] arr = new long[n];
		HashSet<Long> set = new HashSet<Long>();
		
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextLong();
		}
		
		for(int i = 0;i < n;i++) {
			val = 0;
			for(int j = i;j < n;j++){
				val = val | arr[j];
				if(set.contains(val)){
					System.out.println("NO");
					return;
				}
				set.add(val);
			}
		}
		
		System.out.println("YES");
		
		
	}
	
	
}
