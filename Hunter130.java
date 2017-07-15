import java.util.*;
public class Hunter130 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.equalsIgnoreCase("Sat")|| s.equalsIgnoreCase("Sun")|| s.equalsIgnoreCase("Saturday")|| s.equalsIgnoreCase("Sunday"))
			System.out.println("false");
		else if(s.equalsIgnoreCase("Mon")|| s.equalsIgnoreCase("tue")|| s.equalsIgnoreCase("Wed")|| s.equalsIgnoreCase("Thu")|| s.equalsIgnoreCase("Fir")
				|| s.equalsIgnoreCase("Monday") || s.equalsIgnoreCase("Tuesday")|| s.equalsIgnoreCase("Wednesday")|| s.equalsIgnoreCase("Thursday")
				|| s.equalsIgnoreCase("Friday"))
			System.out.println("true");
		else
			System.out.println("Enter correct weekdays");
	}

}
