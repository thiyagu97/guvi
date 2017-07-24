import java.util.*;
public class Hunter75 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array");
		for(int h=0;h<n;h++)
			a[h]=sc.nextInt();
		for(int i=0;i<n;i++){
			if((i+1)!=n){
				if(a[i]>a[i+1])
					System.out.print(a[i+1]);
				else
					System.out.print("-1");
			}
			else{
				if(a[i]>a[0])
					System.out.print(a[i+1]);
			else
				System.out.print("-1");
			}
			if((i+1)!=n)
				System.out.print(" ");
		}
	}
}
