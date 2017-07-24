import java.util.ArrayList;
import java.util.Scanner;
public class Hunter32{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		System.out.println("Enter the Size");
		int n=sc.nextInt();int key=0,ans=0;
		System.out.println("Enter the Queue");
		for(int i=0;i<n;i++)
			c.add(sc.nextInt());
		a=new ArrayList<Integer>(c);
		do
		{
			b.clear();
		for(int i=1;i<a.size();i=i+2)
			b.add(a.get(i));
		
		a.clear();
		a=new ArrayList<Integer>(b);
		}while(b.size()>1);
		for(int j=0;j<c.size();j++){
			key=a.get(0);
			int s=(c.get(j));
			if(key==s){
				ans=j;
			}
		}
		System.out.println("The position of that person in original queue is "+ans);
	}
	

}
