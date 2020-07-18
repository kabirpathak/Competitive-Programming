package round656;
import java.io.*;
import java.util.*;
//AC
public class Question5 {
	
static Scanner sc = new Scanner(System.in);
static ArrayList<Integer> nodes[];
static ArrayList<int[]> undirected;
static HashMap<Integer, Integer> map;
static int current = 0;
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
	}
	
	public static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		undirected = new ArrayList<>();
		nodes = new ArrayList[n];
		map = new HashMap<>();
		//visited nodes
		boolean[] vis = new boolean[n];
		//initialize nodes.
		for(int i = 0;i < n;i++)nodes[i] = new ArrayList<Integer>();
		
		for(int i = 0;i < m;i++) {
			int type = sc.nextInt();
			int src = sc.nextInt();
			int des = sc.nextInt();
			
			if(type == 1) {
			
				nodes[src - 1].add(des - 1);
			}
			
			undirected.add(new int[] {src - 1, des -1});
		}
		
		//check cycle
		boolean[] cyclevis = new boolean[n];
		boolean[] recstack = new boolean[n];
		
		for(int i = 0;i < n;i++) {
			if(!cyclevis[i]) {
				if(isCyclicCheckAndDfs(i, cyclevis, recstack)) {
					System.out.println("NO");
					return;
				}
			}
		}
		
		
		System.out.println("YES");
		
		//topological ordering..
		current = n;
		
		//dfs loop
//		for(int i = 0;i < n;i++) {
//			if(vis[i] != true)
//				dfs(i, vis);
//		}
//		
		for(int[] arr : undirected) {
			int a = map.get(arr[0]);
			int b = map.get(arr[1]);
			
			if(a < b) {
				System.out.println((arr[0] + 1) + " " + (arr[1] + 1));
			}
			else System.out.println((arr[1] + 1) + " " + (arr[0] + 1));
		}
		
	}
	
	public static void dfs(int node, boolean[] vis) {
		vis[node] = true;
		for(Integer ix : nodes[node]) {
			if(!vis[ix])dfs(ix, vis);
		}
		
		map.put(node, current);
		current--;
	}
	
	public static boolean isCyclic(int i, boolean visited[], boolean recstack[]) {
		if (recstack[i]) 
            return true; 
  
        if (visited[i]) 
            return false; 
              
        visited[i] = true; 
  
        recstack[i] = true; 
        
          
        for (Integer c: nodes[i]) 
            if (isCyclic(c, visited, recstack)) 
                return true; 
                  
        recstack[i] = false; 
  
        return false; 
	}
	
	public static boolean isCyclicCheckAndDfs(int i, boolean visited[], boolean recstack[]) {
		if (recstack[i]) 
            return true; 
  
        if (visited[i]) 
            return false; 
              
        visited[i] = true; 
        recstack[i] = true; 
        
          
        for (Integer c : nodes[i]) 
            if (isCyclicCheckAndDfs(c, visited, recstack)) 
                return true; 
                  
        recstack[i] = false; 
        map.put(i, current);
        current--;
        return false; 
	}
}
