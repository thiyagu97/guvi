import java.util.*;
public class FactorialNo {
      public static void main(String[] args){
    	  Scanner sc=new Scanner(System.in);
    	  int sum=1;
    	  System.out.println("Enter the number:");
    	  int n=sc.nextInt();
    	  if(n==1||n==0)
    		  sum=1;
    	  else{
    		  for(int i=1;i<=n;i++){
    			  sum=sum*i;
    		  }
    	  }
    	  System.out.println("Factorial is "+sum);
      }
}
