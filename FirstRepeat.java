import java.util.*;
public class FirstRepeat {
     public static void main(String[] args){
    	 Scanner sc= new Scanner(System.in);
    	 int count=0,ans=0;
    	 System.out.println("Enter the size of array");
    	 int n=sc.nextInt();
    	 int[] a=new int[n];
    	 System.out.println("Enter the element of array");
    	 for(int i=0;i<n;i++){
    		 a[i]=sc.nextInt();
    	 }
    	 for(int j=0;j<n;j++){
    		 count=0;
    		 for(int k=(j+1);k<n;k++){
    			 if(a[j]==a[k]){
    				 ans=a[j];
    				 break;
    			 }
    		 }
    	 }
    	 System.out.println(ans);
     }
}
