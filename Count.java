import java.io.*;
public class Count {
  public static void main(String[] args)throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the stirng");
	  String s=br.readLine();
	  int count1=0,count2=0,count3=0;
	  int l=s.length();
	  char[] c=s.toCharArray();
	  for(int i=0;i<l;i++){
		  if(Character.isAlphabetic(c[i]))
			  count1++;
		  else if(Character.isDigit(c[i]))
			  count2++;
		  else 
			  count3++;
	  }
	  System.out.println("The number of character in the given string is "+count1);
	  System.out.println("The number of digit in the given string is "+count2);
	  System.out.println("The number of Alphanumerical in a given string is "+count3);
  }
}
