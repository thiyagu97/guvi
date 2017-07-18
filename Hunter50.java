import  java.util.*;
public class Hunter50 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();int c=0;
		System.out.println("Enter the divider");
		int D=sc.nextInt();
		if(D==0){
			System.out.println("Divide by zero");
		}
		else{
		while(N>=D){
			c=c+1;
			N = N-D;
        }
		System.out.println("ans "+c);
		}
	}
  
}
