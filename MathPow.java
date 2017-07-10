import java.util.*;
public class MathPow {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the number");
    	 int n=sc.nextInt();
    	 System.out.println("Enter the power");
    	 int power=sc.nextInt();
    	 int ans=(int)Math.pow(n,power);
    	 System.out.println(ans);
     }
}
