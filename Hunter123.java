import java.io.*;
public class Hunter123 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		System.out.println("Enter the String");
		String s=br.readLine();
		int l=s.length();
		char c[]=s.toCharArray();
		for(int i=0;i<l;i++){
			count=0;
				for(int j=0;j<l;j++){
					if(c[i]==c[j])
						count++;
				}
				if(count==1)
					System.out.print(c[i]);
		}
	}
}
