import java.util.*;
public class Hcf2 {
	public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=60;
        int n2=51;
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
