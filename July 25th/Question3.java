package julyLunchTIme;
import java.util.*;
import java.io.*;
//partial AC
public class Question3 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		
		int n = sc.nextInt();
		
		long arr[] = new long[n];
		
		for(int i =0;i < n;i++) {
			arr[i] = sc.nextInt();
			
		}
		long ans = 0;
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				
				 ans = Math.max(ans, binaryConcat(arr[i], arr[j]));
				 System.out.println("Check for : " + arr[i] + " and " + arr[j] + "\nans = " + ans);
			}
		}
		
		
		System.out.println(ans);
	}
	
	public static long binaryConcat(long min, long max) {
		
		String a = Long.toBinaryString(min);
		String b = Long.toBinaryString(max);
		
		String temp = a;
		a = a + b;
		b = b + temp;
		
		long aval = Long.parseLong(a,2);
		long bval = Long.parseLong(b,2);
		
		return Math.abs(aval - bval);
	}
	
	
}
