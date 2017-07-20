import java.io.*;
import java.util.*;
public class Pro53 {
	public static void main(String[] args)throws IOException{
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Character> ts=new TreeSet<Character>();
		System.out.println("Enter the string");
		String s=br.readLine();
		 String str = s.toLowerCase().replaceAll(" ", "");
		 for(int i=0;i<str.length();i++){
			 char c=str.charAt(i);
			 ts.add(c);
		 }
		 System.out.println(ts.size());
		 if(ts.size()==26)
			 System.out.println("Pangrams");
		 else
			 System.out.println(" not Pangrams");	 
	}

}
