import java.io.*;
import java.util.*;
public class Hunter48 {
    public static void main(String[] args)throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the string");
    	ArrayList<String> list=new ArrayList<String>();
    	int ans=0,count=0;
    	String str=br.readLine();
    	Integer start=0;
    	int l=str.length();
    	System.out.println("Enter the substring");
    	String num=br.readLine();
    	ans=str.indexOf(num);
    	System.out.println(ans);
    }
}
