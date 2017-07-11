import java.io.*;
public class ReverseNo {
    public static void main(String[] args)throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Integer n=Integer.parseInt(br.readLine());
    	String s=String.valueOf(n);
    	char[] c=s.toCharArray();
    	Integer l=c.length;
    	for(int i=(l-1);i>=0;i--){
    		System.out.print(c[i]-48);
    	}
    }
}
