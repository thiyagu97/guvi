import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	Integer start =sc.nextInt();
    	Integer end=sc.nextInt();
    	Integer flag=0,count=0; 
    	 for( int i=start;i<=end;i++){
    		 flag=1;
    	        for( int j=2;j<=(i/2);j++){
    	            if(i%j==0){
    	                flag=0;
    	                break;
    	                }
    	         }
    	        if(flag==1)
    	        count++;
    	        }
    	 System.out.println(count);
    }
}
