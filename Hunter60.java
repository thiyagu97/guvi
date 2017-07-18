import java.util.*;
public class Hunter60 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int ans=0;
		int n1[]=new int[a];
		int n2[]=new int[a];
		System.out.println("Enter the array");
		for(int i=0;i<a;i++)
			n1[i]=sc.nextInt();
		System.out.println("Enter the  rotated array");
		for(int j=0;j<a;j++)
			n2[j]=sc.nextInt();
		for(int l=0;l<a;l++){
			if(n2[0]==n1[l]){
				ans=l;
				break;
			}
		}
		System.out.println("The K value is "+ans);
	}

}
