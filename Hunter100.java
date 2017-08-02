import java.util.*;
public class Hunter100 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Integer n=sc.nextInt();
		int sum=0,pow,ans;
		String s=String.valueOf(n);
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			int num=(c[i]-48);
			if((i+1)!=c.length)
				pow=(c[i+1]-48);
			else
				pow=0;
			ans=(int) Math.pow(num,pow);
			sum=sum+ans;
		}
		System.out.println("Sum is "+sum);
	}

}
