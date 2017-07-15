import java.util.Scanner;
public class Hunter134 {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int flag=0;
    	int flag1=0;
    	  System.out.println("Enter the 2 number");   
    	int n=sc.nextInt();
    	int n1=sc.nextInt();
    	for(int i=2;i<=(n/2);i++){    
    		   if(n%i==0){    
    		   flag=1;    
    		   break;    
    		   }    
    		  }
		for(int j=2;j<=(n1/2);j++){    
 		   if(n1%j==0){    
 		   flag1=1;    
 		   break;    
 		   }    
 		  }
    		  if(flag==0 && flag1==0)    
    		  System.out.println("Co-prime");   
    		  else
    			  System.out.println("not a Co-prime");   

    }
}
