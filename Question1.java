package codechefCookOffJuly;
import java.util.*;
import java.io.*;
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
		char[] arr = sc.next().toCharArray();
		
		if(n % 2 == 1) {
			System.out.println("NO");
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0;i < n;i++) {
			char ch = arr[i];
			if(!map.containsKey(ch))
				map.put(ch, 0);
			map.put(ch,  map.get(ch) + 1);
		}
		
		for(Character ch : map.keySet()) {
			if(map.get(ch) % 2 == 1) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}

}
