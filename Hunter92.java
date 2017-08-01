import java.util.*;
public class Hunter92 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String mytext=sc.nextLine();
		mytext = mytext.replaceAll("\\s+", " ").trim();
		System.out.println(mytext);
	}

}
