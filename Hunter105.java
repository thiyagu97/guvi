import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hunter105 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the Integer");
    	Integer n=Integer.parseInt(br.readLine());
    	String s=String.valueOf(n);
    	int l,sum=0,mul=1;
    	l=s.length();
    	char[] c=s.toCharArray();
    	for(int i=0;i<l;i++){
    		mul=1;
    		if((l-1)==i){
    			for(int j=0;j<(c[0]-48);j++){
    				mul=mul*(c[i]-48);
    			}
    		}
    		else
    		{
    			for(int j=0;j<(c[i+1]-48);j++){
    				mul=mul*(c[i]-48);
    			}
    		}
    		sum=sum+mul;
    	}
    	System.out.println(sum);
    }

}
