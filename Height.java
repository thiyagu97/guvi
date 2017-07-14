import java.util.*;
public class Height {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Float n[]=new Float[10];
		System.out.println("Enter the heights");
		for(int i=0;i<50;i++){
			n[i]=sc.nextFloat();
		}
		Arrays.sort(n);
		System.out.println("Enter the height u want to serch");
		int k=sc.nextInt();
		System.out.println("4th tallest student height is "+n[50-4]);
		if(k<=50)
		System.out.println("Kth tallest student is "+n[k]);
		else
			System.out.println("limit is 50 numbers only");
	}

}
