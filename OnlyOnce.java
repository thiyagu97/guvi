import java.util.*;
public class ExactlyTwice {
public static void main( String[] args){
	   Scanner sc= new Scanner(System.in);
	   int count=0,ans=0;
	   System.out.println("Ente the size the array");
	   int n=sc.nextInt();
	   int[] a=new int[n];
	   System.out.println("Ente the values");
	   for(int i=0;i<n;i++){
		   a[i]=sc.nextInt();
	   }
	   for(int j=0;j<n;j++){
		   count=0;
		   for(int k=0;k<n;k++){
			   if(a[j]==a[k]){
				   count++;
			   }
		   }if(count==1){
			   ans=a[j];
		   }
	   }
		   System.out.println(ans);
   }
}
