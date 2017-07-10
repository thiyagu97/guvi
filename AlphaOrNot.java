import java.io.*;
public class AlphaOrNot {
      public static void main(String[] args)throws IOException{
    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	  char c=(char) br.read();
    	  if(Character.isAlphabetic(c)){
    		  System.out.println("Alphabetic");
    	  }
    	  else
    		  System.out.println("Not an Alphabetic");
      }
}
