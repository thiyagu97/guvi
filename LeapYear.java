import java.time.Year; 
import java.util.*;
public class LeapYear {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	  Year year = Year.of(n);  
    	    if(year.isLeap()){
    	    	System.out.println("Leap Year");
    	    }
    	    else
    	    	System.out.println("Not an Leap Year");
     }
}
