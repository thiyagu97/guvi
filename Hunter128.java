import java.util.*;
public class Hunter128 {
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int[] n=new int[a];
		System.out.println("Enter the elements in array");
		for(int k=0;k<a;k++){
			n[k]=sc.nextInt();
		}
		Arrays.sort(n);
		for(int l=0,i=(a-1),j=0;l<a && i>=(a/2)||j<(a/2);l++){
			if((l+1)%2!=0){
			System.out.println(n[i]);
			i--;}
			else{
				System.out.println(n[j]);
				j++;}
		}
	}

}
