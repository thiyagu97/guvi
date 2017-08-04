import java.util.*;
public class Hunter88 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String ans="";String rep="";
		char c1;int count=0,flag=1;
		char[] c=s.toCharArray();
		for(int i=(s.length()-1);i>=0;i--){
			c1=s.charAt(i);count=0;flag=1;rep="";
					for(int i1=(s.length()-1);i1>=0;i1--){
				if(c1==s.charAt(i1) && s.charAt(i1) != ' '){
					count++;
					if(count==1){
						ans=ans+c1;
						flag=0;
						rep=rep+c1;
						s=s.replaceAll(rep," ");
						break;
					}
				}
			}
		}
		System.out.println("Output is : \n"+ans);
	}

}
