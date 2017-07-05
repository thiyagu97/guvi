import java.io.*;
public class IntToString {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		Integer n=Integer.parseInt(s);
		System.out.println(n);
	}
}
