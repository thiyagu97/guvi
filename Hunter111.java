package guvi;
import java.io.*;
import java.util.*;
public class Hunter111 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		ArrayList<String> list=new ArrayList<String>();
		Integer start=0,ss=3;
		Integer count=0;
		String s=br.readLine();
		Integer l=s.length();
		Integer limit=l-(ss-1);
		for(int i=0;i<limit;i++){
			list.add(s.substring(start,ss));
			start++;ss++;
		}
		for(int j=0;j<list.size();j++){
			char[] c=list.get(j).toCharArray();
			if(((c[0]>=97 && c[0]<=109) || (c[0]>=65 && c[0]<=77)) && ((c[2]>=97 && c[2]<=109) || (c[2]>=65 && c[2]<=77))){
				if((c[1]>=110 && c[1]<=122) || (c[1]>=78 && c[1]<=90)){
					count++;
				}
			}
			else if(((c[0]>=110 && c[0]<=122) || (c[0]>=78 && c[0]<=90)) && ((c[2]>=110 && c[2]<=122) || (c[2]>=78 && c[2]<=90))){
				if((c[1]>=97 && c[1]<=109) || (c[1]>=65 && c[1]<=77)){
					count++;
				}
			}
		}
		if(count==list.size())
			System.out.println(s+" is balanced");
		else
			System.out.println(s+" is not balanced");
	}

}
