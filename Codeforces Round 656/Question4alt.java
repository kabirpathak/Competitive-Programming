package round656;
import java.util.*;
import java.io.*;
//AC

public class Question4alt {
static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		
		int start = 0, end = n;
		char check = 'a';
		int ans = 0;
		
		
		ans = func(arr, start, end, check);
		
		
		System.out.println(ans);
	}
	
	public static int checkFor(char c, int start, int end, char[] arr) {
		//System.out.println("from " + start + " to " + (end - 1));
		
		if(end <= start)return Integer.MAX_VALUE;
		int count = 0;
		for(int i = start;i < end;i++) {
			if(arr[i] != c)count++;
		}
		return count;
	}
	
	public static int func(char[] arr, int start, int end, char c) {
		if(end <= start)return 0;
		if(end - start == 1) {
			
			if(arr[start] == c)return 0;
			else return 1;
		}
		int mid = start + (end - start)/2;
		char cx = (char)(c+1);
		int a = checkFor(c, start, mid, arr) + func(arr, mid, end, cx);
		int b = checkFor(c, mid, end, arr) + func(arr, start, mid, cx);
		
		//System.out.println("a = " + a + " b = " + b);
		
		return Math.min(a, b);
	}
}
