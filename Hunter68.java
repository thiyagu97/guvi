import java.util.*;
public class Hunter68 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrray");
		Integer a=sc.nextInt();
		System.out.println("Enter the elements in array");
		int[] n=new int[a];
		int dif,dif1,dif2,m=0,ans=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int l=0;l<a;l++)
			n[l]=sc.nextInt();
		for(int i=0;i<a;i++){
			if((i+1)!=a){
				dif=Math.abs(n[i+1]-n[i]);
				list.add(dif);
			}
		}
		dif1=Collections.max(list);
		for(int j=0;j<a;j++){
			if((j+1)!=a){
				dif2=Math.abs(n[j+1]-n[j]);
				if(dif1==dif2){
					ans=j;
					break;
				}
			}
		}
		System.out.println("Output : "+ans);
	}

}
