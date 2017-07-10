import java.util.*;
public class PrimeIntervals {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int flag=0;
    	System.out.println("Enter the  start number"); 
    	int start=sc.nextInt();
    	System.out.println("Enter the  end number"); 
    	int end=sc.nextInt();
    	for(int j=start;j<=end;j++){
    		flag=0;
    		for(int i=2;i<=(j/2);i++){
    			if(j%i==0){
    				flag=1;
    				break;
    			}
    		}
    		if(flag==0)
    			System.out.print(j+" ");
    	}
    }
}
