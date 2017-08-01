import java.io.*;
public class Pro17 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		Integer n=Integer.parseInt(br.readLine());
		String s=String.valueOf(n);
	    int temp=n;
	    int l=s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<l;i++){
			temp=temp*(ch[i]-48);
		}
		System.out.println(n+" is a seed of "+temp);
		}
}
