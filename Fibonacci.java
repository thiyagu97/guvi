import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the limit");
    	int n=sc.nextInt();
    	int n3,n2=1,n1=0;
    	if(n==1)
    		System.out.print(n1);
    	else if(n==2)
    		System.out.print(n1+" "+n2);
    	else{
    		System.out.print(n1+" "+n2);
    	for(int i=2;i<n;i++) {    
    	  n3=n1+n2;    
    	  System.out.print(" "+n3);    
    	  n1=n2;    
    	  n2=n3;    
    	 } 
    	}
    }
}
