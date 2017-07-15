import java.io.*;
public class Hunter133 {
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String str=br.readLine();
	String[] s=str.split(" ");
	System.out.println(s[1]+" "+s[0]);
	}

}
