import java.io.*;
public class import java.io.*;
public class Hunter83 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s=br.readLine();
		int str=s.indexOf('x');
		int n=(str-1);int c=(str+1);
		String s1="";
		int no=s.charAt(n);char ch=s.charAt(c);
		char[] ch1=s.toCharArray();
		for(int i=0;i<s.length();){
			if(ch1[i]==no && ch==ch1[i+2]){
				for(int j=0;j<(ch1[i]-48);j++){
					s1=s1+ch1[i+2];
				}
					i=i+3;
			}
			else{
				s1=s1+ch1[i];
				i++;}
		}
		System.out.println(s1);
	}

} {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s=br.readLine();
		int str=s.indexOf('x');
		int n=(str-1);int c=(str+1);
		String s1="";
		int no=s.charAt(n);char ch=s.charAt(c);
		char[] ch1=s.toCharArray();
		for(int i=0;i<s.length();){
			if(ch1[i]==no && ch==ch1[i+2]){
				for(int j=0;j<(ch1[i]-48);j++){
					s1=s1+ch1[i+2];
				}
					i=i+3;
			}
			else{
				s1=s1+ch1[i];
				i++;}
		}
		System.out.println(s1);
	}

}
