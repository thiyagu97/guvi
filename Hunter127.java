import java.util.*;
public class Hunter127 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int n=sc.nextInt();
		int flag=0,sum=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			flag=0;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
			list.add(i);
		}
		for(int m=0;m<list.size();m++){
			sum=sum+list.get(m);
		}
		System.out.println("The sum is "+sum);
	}

}
