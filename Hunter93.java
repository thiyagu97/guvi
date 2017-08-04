import java.io.*;
import java.util.*;
public class Hunter93 {
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the string");
		String s=br.readLine();
		String ans="",ans1="";String c;
		int j=0,v;
		String [] s1=s.split(" ");
		for(String word:s1){
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			ans=ans+sb.toString()+" ";
		}
		ans=ans.trim();
		String [] s2=ans.split(" ");
		for(String w:s1){
			for(int i=0;i<w.length();i++){
				if(Character.isUpperCase(w.charAt(i)))
					list.add(1);
				else
					list.add(0);
			}
		}
		for(String w1:s2){
			c="";
			for(int m=0;m<w1.length();m++){
				v=list.get(j);
				if(v==1){
					char c1=w1.charAt(m);
					String st=String.valueOf(c1).toUpperCase();
				c=(c+""+st);
				j++;
				}
				else if(v==0){
					char c1=w1.charAt(m);
					String st=String.valueOf(c1).toLowerCase();
					c=(c+""+st);j++;
				}
			}
			ans1=ans1+c+" ";
		}
		ans1=ans1.trim();
		System.out.println("Output is :\n"+ans1);
	}

}
