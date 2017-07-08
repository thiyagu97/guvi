import java.io.*;
public class Reverse1 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int j=0;String ans;
		char[] c=new char[name.length()];
		char[] c1=name.toCharArray();
		for(int i=(c1.length)-1;i>=0;i--){
			c[j]=c1[i];
			j++;
		}
		ans=String.valueOf(c);
		System.out.println(ans);
	}
}
