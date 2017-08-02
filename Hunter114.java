import java.util.*;
public class Hunter114 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Integer n=sc.nextInt();
		int flag=1,sum=0,count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=10;i<=100;i++){
			flag=0;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					flag=1;break;
				}
			}
			if(flag==0)
				list.add(i);
		}
		for(int i1=0;i1<list.size();i1++){
			sum=0;int a1=list.get(i1);count=0;flag=1;
			for(int i2=0;i2<list.size() && i1!=i2;i2++){
				int a2=list.get(i2);
				sum=a1+a2;
				if(sum==n){
					count=2;
					flag=0;
					break;}
			}
			if(flag==0)
				break;
		}
		if(flag==1){
		for(int i3=0;i3<list.size();i3++){
			int a3=list.get(i3);
			if(n%a3==0){
				flag=0;
				System.out.println("The answer is "+(n/a3));
				break;
			}
	    	}
		}
		else
		System.out.println("The answer is "+count);
		if(flag==1)
			System.out.println("The answer is 0");
	}
}
