import java.util.*;
public class Hunter58 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int count=0,dif;
		int[] n=new int[a];
		System.out.println("Enter the array");
		for(int h=0;h<a;h++)
			n[h]=sc.nextInt();
		System.out.println("Enter the value");
		int k=sc.nextInt();
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(i!=j){
					dif=Math.abs(n[i]-n[j]);
					if(dif==k){
						count++;}
				}
			}
		}
		System.out.println((count/2));
	}

}
