import java.util.ArrayList;
import java.util.Scanner;
public class Pro66 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the number of items");
		int I=sc.nextInt();
		int sum=0;
		System.out.println("Enter the 0-based index item number that Anna did not eat");
		int IN=sc.nextInt();
		System.out.println("Enter the amount for those Items");
		for(int i=0;i<I;i++){
			int item=sc.nextInt();
			list.add(item);
		}
		System.out.println("Enter the amount of money that Brain Charged Anna for her share of the bill");
		int s=sc.nextInt();
		for(int j=0;j<I;j++){
			if(j!=IN)
				sum=sum+list.get(j);
		}
		int half=sum/2;
		System.out.println("Output is ");
		if(s<=half)
			System.out.println("Bon Appetit");
		else{
			System.out.println(s-half);
		}
	}

}
