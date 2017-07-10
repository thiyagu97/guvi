import java.io.*;
public class VowelOrConsonant {
     public static void main(String[] args)throws IOException{
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 char c=(char)br.read();
    	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
			c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    		 System.out.println(" Vowels");
    	 }
    	 else
    		 System.out.println("Consonant");
     }
}

