import java.util.*;
	import java.io.*;
	  public class Reverse{
	    public static void main(String[] args)throws IOException{
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine();
	    char[] c=s.toCharArray();
	    Integer l=c.length;
	    for(int i=(l-1);i>=0;i--){
	    System.out.print(c[i]);
	    }    
	  }
	  }
