import java.io.*;
public class Hunter102 {
       public static void main(String[] args)throws IOException{
    	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	   System.out.println("Enter the Integer");
    	   Integer n=Integer.parseInt(br.readLine());
    	   String s=String.valueOf(n);
    	   int ans=0,sum=0;
    	   Integer l=s.length();
    	   char[] c=s.toCharArray();
    	   for(int i=0;i<l;i++){
    		   sum=0;
    		   for(int j=0;j<=i;j++){
    			   sum=sum+(c[j]-48);
    		   }
    		   ans=ans+sum;
    	   }
    	   System.out.println(ans);
       }
}
