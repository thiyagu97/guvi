import java.util.*;
public class Hcf {
	public static void main(String Args[])
    {
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int h=1;
        int p=n1*n2;
        for(int i=2;i<p;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                h=i;
            }
        }
        System.out.println("HCF = "+h);
    }
}
