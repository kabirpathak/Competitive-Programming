package round658;
import java.util.*;
import java.io.*;
//AC
public class Question3b {

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
		char[] arr = sc.next().toCharArray();
		char[] brr = sc.next().toCharArray();
		char ch = arr[0];
		
		int i = 0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		while(i < n) {
			if(arr[i] == ch)i++;
			else {
				list1.add(i);
				
				ch = ch == '0' ? '1' : '0';
				i++;
			}
			
		}
		if(ch == '1')list1.add(n);
		
		//System.out.println(list);
		
		ch = brr[0];
		i = 0;
		while(i < n) {
			if(brr[i] == ch)i++;
			else {
				list2.add(i);
				ch = ch == '0' ? '1' : '0';
				i++;
			}
		}
		
		if(ch == '1')list2.add(n);
		
		bw.write(String.valueOf(list1.size() + list2.size()) + " ");
		for(int j = 0;j < list1.size();j++)bw.write(String.valueOf(list1.get(j) + " "));
		for(int j = list2.size() - 1;j >= 0;j--)bw.write(String.valueOf(list2.get(j)) + " ");
		bw.write("\n");
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
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
