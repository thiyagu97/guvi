import java.util.*;
public class Hunter80 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=a;i++){
			if(i<=10){
				list.add(i);
			}
			else{
				String num=String.valueOf(i);
				char[] c=num.toCharArray();
				count=0;
				for(int i1=0;i1<c.length-1;i1++){
					int n1=c[i1];int n2=c[i1+1];
					if(Math.abs(n1-n2)==1){
						count++;
						}
					}
				if(count==((c.length)-1))
					list.add(i);
			}
		}
				System.out.println("All Possible are");
		for(Integer ans:list)
		System.out.println(ans);
	}
}
