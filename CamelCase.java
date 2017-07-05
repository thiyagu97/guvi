import java.io.*;
public class CamelCase {
    public static void main(String[] args)throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String s=br.readLine();
    	String[] word=s.split(" ");
    	for(String s1:word){
    		char[] c=s1.toCharArray();
    		c[0]=Character.toUpperCase(c[0]);
    		String ans=String.valueOf(c);
    		System.out.print(ans+" ");
    		}
    }
}
