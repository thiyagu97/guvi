import java.util.*;
public class Lcm {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter 2 number");
    	 int count,ans=0;
    	 int n1=sc.nextInt();
    	 int n2=sc.nextInt();
    	 int min=Math.min(n1,n2);
    	 int max=Math.max(n1,n2);
    	 for(int i=1;i<=min;i++){
    		 count=max*i;
    		 if(count%min==0){
    			 ans=count;
    			 break;
    		 }
    	 }
    	 System.out.println("Lcm is "+ans);
     }
}
