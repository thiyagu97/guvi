import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hunter116 {
	public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the Integer");
    	Integer n=Integer.parseInt(br.readLine());
    	String s=String.valueOf(n);
    	int l,sum=0;
    	l=s.length();
    	char[] c=s.toCharArray();
    	for(int i=0;i<l;i++){
    		sum=sum+(int)Math.pow((c[i]-48),i);
    	}
    	System.out.println(sum);
	}
}
