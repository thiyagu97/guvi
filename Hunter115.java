import java.io.*;
import java.util.*;
public class Hunter115 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two string");
		String s1=br.readLine();
		String s2=br.readLine();
		ArrayList<Character> list1=new ArrayList<Character>();
		ArrayList<Character> list2=new ArrayList<Character>();
		Integer n1=s1.length();Integer n2=s2.length();
		if(n1<n2){
			int sub=n2-n1;
			for(int i=1;i<=sub;i++)
				s1=s1+i;
		}
		else{
			int sub=n1-n2;
			for(int i=1;i<=sub;i++)
				s2=s2+i;
		}
		for(int i=0;i<s1.length();i++)
			list1.add(s1.charAt(i));
		for(int j=0;j<s2.length();j++)
			list2.add(s2.charAt(j));
		if(list1.size()==list2.size()){
		for(int i1=0;i1<list1.size();i1++)
			System.out.print(list1.get(i1).toString()+list2.get(i1).toString());
		}
	}
}
