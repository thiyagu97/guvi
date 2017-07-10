import java.util.*;;
public class ArmstrongInterval {
	 public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int mul=1,sum=0;
    	 System.out.println("Enter the start number");
    	 int start=sc.nextInt();
    	 System.out.println("Enter the  end number");
    	 int end=sc.nextInt();
    	 for(int n=start;n<=end;n++){
    		 sum=0;
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
     		 System.out.print(n+" ");
    	 }
     }

}
