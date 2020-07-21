package round658;
import java.util.*;import java.io.*;

public class Question3 {

	static FastReader sc = new FastReader();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		int t = sc.nextInt();
		while(t-->0) {
			solve();
		}
		bw.flush();
		bw.close();
	}
	
	public static void solve() throws IOException{
		int n = sc.nextInt();
		char[] arr = new char[n];
		char[] brr = new char[n];
		
		arr = sc.next().toCharArray();
		brr = sc.next().toCharArray();
		
		
		int i = n - 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i >= 0) {
			
			if(arr[i] != brr[i]) {
			
				//different.. 
				if(i > 0 && arr[i] != arr[0]) {
					arr[0] = arr[i];
					list.add(1);
				
				}
				
				
					list.add(i + 1);
					arr = prefixize(arr, i + 1);
					
				
				
				
			}
			i--;
			
			
		}
		
		bw.write(String.valueOf(list.size()) + " ");
		
		for(int a = 0;a < list.size();a++)bw.write(String.valueOf(list.get(a)) + " ");
		bw.write("\n");
	}
	
	public static char[] prefixize(char[] arr, int n) {
		int val = n/2;
		if(n % 2 == 1)val++;
		for(int i = 0;i < val;i++) {
			
			int temp =arr[i];
			
			arr[i] = arr[n - i - 1] == '0' ? '1' : '0';
			arr[n - i - 1] = temp == '0' ? '1' : '0';
		}
		return arr;
	}

	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
