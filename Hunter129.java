import java.io.*;
import java.util.*;
public class Hunter129 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		System.out.println("Enter the String");
		String s=br.readLine();
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++){
			list.add((int)c[i]);
		}
		for(int i1=0;i1<list.size();i1++){
			if((i1+1)!=list.size()){
			int sub=Math.abs(list.get(i1+1)-list.get(i1));
			sum=sum+sub;}
			else{
				int sub=Math.abs(list.get(0)-list.get(i1));
				sum=sum+sub;
			}
		}
		int ans=Math.abs(sum-list.get(0));
		System.out.println("The Character is : "+(char)ans);
	}

}
