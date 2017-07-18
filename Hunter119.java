import java.util.*;
public class Hunter119 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n[]=new int[4];
		int max=0,min=0;
		for(int i=0;i<4;i++)
			n[i]=sc.nextInt();
		int rs=sc.nextInt();
		Arrays.sort(n);
		for(int j=0;j<3;j++)
			min=min+n[j];
		for(int l=3;l>0;l--)
			max=max+n[l];
		System.out.println("Minimal amount for 3 gift is "+min);
		System.out.println("Maximal amount for 3 gift is "+max);
	}
  
}
