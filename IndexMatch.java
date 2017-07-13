import java.util.*;
public class IndexMatch {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int ans=0,count=0;
	System.out.println ("Enter the size of array");
	int a=sc.nextInt();
	int[] n=new int[a];
	System.out.println ("Enter the elements in the array");
	for(int i=0;i<a;i++){
		n[i]=sc.nextInt();
	}
	for(int j=0;j<a;j++){
		if(j==n[j]){
			ans=j;
			count++;
			break;
		}
	}
	if(count!=0)
	System.out.println("The number "+ans+" equals its index "+ans);
	else
		System.out.println("The number didnt match with any index");
	}
}
