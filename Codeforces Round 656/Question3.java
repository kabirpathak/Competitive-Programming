package round656;
import java.util.*;
import java.io.*;
//AC
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
		int[] arr = new int[n];
		
		for(int i = n-1;i >= 0;i--)arr[i] = sc.nextInt();
		
		
		
		
//		for(int i = 0;i < n;i++)System.out.print(arr[i] + " ");
//		System.out.println();
		
		int i = 1;
		
		while(i < n && arr[i] >= arr[i-1]) {
			i++;
			//System.out.println("inc i = " + i);
			if(i >= n)break;
		}
		//System.out.println(i);
		
		while(i < n && arr[i] <= arr[i-1]) {
			//System.out.println("dec i = " + i);
			i++;
			if(i >= n)break;
		}
		
		System.out.println((n - i));
	}

}
