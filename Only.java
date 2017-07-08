import java.util.*;
public class Only {
public static void main( String[] args){
	   Scanner sc= new Scanner(System.in);
	   int c=0,ans=0;
	   System.out.println("Ente the size the array");
	   int n=sc.nextInt();
	   int[] a=new int[n];
	   System.out.println("Ente the values");
	   for(int i=0;i<n;i++){
		   a[i]=sc.nextInt();
	   }
	   for(int j=0;j<n;j++){
		   c=0;
		   for(int k=0;k<n;k++){
			   if(a[j]==a[k]){
				   c++;
			   }
		   }if(c==1){
			   ans=a[j];
		   }
	   }
		   System.out.println(ans);
   }
}
