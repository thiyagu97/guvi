import java.util.*;
public class Hunter69 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mailId");
		String s=sc.next();int s1=0,s2=0,s3=0,count=0,s4=0;
		String[] str=s.split("@");
			int l=str[0].length();
			if(l>=3){
				s1=1;}
			if(s.endsWith(".com")){
				s2=1;}
			char[] c=s.toCharArray();
			for(int i=0;i<c.length;i++){
				if(c[i]=='@')
					count++;
			}
			if(count==1){
				s3=1;}
			String[] str1=str[1].split("\\.");
			int l1=str1[0].length();
			if(l1>=4){
				s4=1;}
			if(s1==1 && s2==1 && s3==1 && s4==1){
				System.out.println("Valid MainlId");
			}
			else
				System.out.println("Invalid MainId");
	}

}
