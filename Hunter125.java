import java.io.*;
import java.util.*;
public class Hunter125 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s1=br.readLine();
		int start=0;
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=2;i<=s1.length();i++){
			start=0;
			int ss=i;
			int l=s1.length();
			int limit=l-(i-1);
			for(int i1=0;i1<limit;i1++){
				list.add(s1.substring(start,ss));
			start++;ss++;}
		}
		for(int i2=0;i2<list.size();i2++){
			String s2=list.get(i2);
			StringBuffer sb=new StringBuffer(s2);
			sb.reverse();
			if(s2.equals(sb.toString()))
				list1.add(s2);
		}
		System.out.println("All possible palindrome String :");
		for(String ans:list1)
		System.out.println(ans);
	}
}
