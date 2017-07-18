import java.util.*;
public class Hunter51 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 number");
		String s1=sc.next();
		String s2=sc.next();
		int n1=Integer.valueOf(s1);
		int n2=Integer.valueOf(s2);
		int ans=n1*n2;
		String s=String.valueOf(ans);
		System.out.println("Ans is "+s);
	}

}
