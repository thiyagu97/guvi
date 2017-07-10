import java.util.*;
public class Armstrong {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int mul=1,sum=0;
    	 System.out.println("Enter the number");
    	 int n=sc.nextInt();
    	 String s=String.valueOf(n);
    	 int l=s.length();
    	 char[] ch=s.toCharArray();
    	 for(int i=0;i<l;i++){
     		mul=1;
     		for(int j=0;j<l;j++){
     			mul=mul*(ch[i]-48);
     		}
     		sum=sum+mul;
     	}
     	if(sum==n)
     		 System.out.println("Armstrong number");
     	else
     		 System.out.println("Not Armstrong number");
     }
}
