import java.util.*;
public class Prime{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int flag=0;
    	  System.out.println("Enter the number");   
    	int n=sc.nextInt();
    	for(int i=2;i<=(n/2);i++){    
    		   if(n%i==0){    
    		   System.out.println("Not prime");    
    		   flag=1;    
    		   break;    
    		   }    
    		  }    
    		  if(flag==0)    
    		  System.out.println("Prime");    

    }
}
