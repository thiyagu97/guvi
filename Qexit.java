import java.io.*;
public class Qexit {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character");
		char c=(char)br.read();
		if(c=='q'|| c=='Q'){
			System.exit(0);
		}
		else
			System.out.println("Character is "+c);
	}
}
