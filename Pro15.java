import java.util.*;
public class Pro15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		ArrayList<Integer> tm=new ArrayList<Integer>();
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int a=sc.nextInt();int count=0;
		for(int i=0;i<a;i++)
			list.add(sc.nextInt());
		for(int m=0;m<a;m++){
			count=0;
		      String s=String.format("%16s", Integer.toBinaryString(list.get(m))).replace(" ", "0");
		       list1.add(s);
		     char[] c=s.toCharArray();
		     for(int j=0;j<c.length;j++){
		    	 if((c[j]-48)==1)
		    	 count++;
		     }
		     tm.add(count);
		}
		Collections.sort(list1);Collections.sort(tm);
		
		int l=list1.size();
		for(int h=(tm.size()-1);h>=0;h--){
			int ans=tm.get(h);
			for(int m=(l-1);m>=0;m--){
				String s1=list1.get(m);
				count=0;
				  char[] c=s1.toCharArray();
				     for(int j=0;j<c.length;j++){
				    	 if((c[j]-48)==1)
				    	 count++;
				     }
				     if(ans==count){
				    	 System.out.println(Integer.parseInt(s1,2));
				    	 list1.remove(m);
				    	 l=list1.size();
				     }
			}
	  }
	}
}
