import java.util.*;
public class Hunter67 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum1=0,sum2=0;
		String str1=sc.next();
		String str2=sc.next();
		String[] s1=str1.split("[a-z,A-Z,#]");
		String[] s2=str2.split("[a-z,A-Z,#]");
		String[] s3=str1.split("[0-9,#]");
		String[] s4=str2.split("[0-9,#]");
		for(String w1:s1){
			try{
			sum1=sum1+(Integer.parseInt(w1));}
		catch(NumberFormatException e){}
			}
		for(String w2:s2){
			try{
			sum2=sum2+(Integer.parseInt(w2));}
		catch(NumberFormatException e){}
			}
		if(sum1>sum2){
			for(String ans1:s3)
				System.out.print(ans1);
		}
		else{
			for(String ans2:s4)
				System.out.print(ans2);
		}
	}

}
