import java.io.*;
public class Length {
     public static void  main(String[] args) throws IOException{
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 Integer n=Integer.parseInt(br.readLine());
    	 String s=String.valueOf(n);
    	 int l=s.length();
    	 System.out.println(l);
     }
}
