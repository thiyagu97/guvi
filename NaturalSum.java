import java.util.*;
public class NaturalSum {
 public static void main(String args[]){
        int n;
        int sum = 0;
        System.out.println("Enter Number");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        for(int i=1;i <=n;i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum is "+sum);
    } 
}
