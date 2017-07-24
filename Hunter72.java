import java.io.*;
public class Hunter72 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings");
		String s=br.readLine();
		String word="";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++){
			if((i+1)%2!=0){
				StringBuffer sb=new StringBuffer(str[i]);
				sb.reverse();
				word=word+sb.toString()+" ";
			}
			else
			word=word+str[i]+" ";
		}
		System.out.println(word);
	}

}
