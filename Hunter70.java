import java.util.ArrayList;
import java.util.Scanner;
public class Hunter70 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrray");
		Integer a=sc.nextInt();int sum=0,count=0;
		System.out.println("Enter the elements in array");
		int[] n=new int[a];
		for(int l=0;l<a;l++)
			n[l]=sc.nextInt();
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of target");
		int t=sc.nextInt();
		for(int i=0;i<m;i++){
			sum=sum+n[i];
		if(sum==t){
			count=1;
			break;
		}}
		if(count==1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
