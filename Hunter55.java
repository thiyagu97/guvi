import java.util.*;
public class Hunter55 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int a=sc.nextInt();
		int n[]=new int[a];
		System.out.println("Enter the array");
		for(int h=0;h<a;h++){
			n[h]=sc.nextInt();
		}
		System.out.println("Enter the position value");
		int d=sc.nextInt();
		for(int i=d;i<=(a-1);i++)
			System.out.print(n[i]+" ");
		for(int j=0;j<d;j++){
			System.out.print(n[j]);
			if(j!=(d-1))
				System.out.print(" ");
		}
	}
}
