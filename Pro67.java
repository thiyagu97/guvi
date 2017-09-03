import java.util.*;
import java.io.*;
public class Pro67 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		int count=0;
		System.out.println("Enter the number of student in class");
		Integer n=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of friend for ALex");
		Integer nf=Integer.parseInt(br.readLine());
		System.out.println("Enter the Single binary String");
		String s=br.readLine();
		System.out.println("Enter the ID of the Alex friends");
		for(int i=0;i<nf;i++){
			list.add(Integer.parseInt(br.readLine()));
		}
		char ch[]=s.toCharArray();
		for(int i1=0;i1<nf;i1++){
			if(ch[list.get(i1)-1]=='0')
				count++;
		}
		System.out.println("Output is");
		if(count!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
