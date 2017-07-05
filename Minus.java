import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Mins {
   public static void main(String[] args) throws IOException, ParseException{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String start=br.readLine();
	   String end=br.readLine();
	   SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	   Date d1=sdf.parse(start);
	   Date d2=sdf.parse(end);
	   long ans=Math.abs(d2.getTime()-d1.getTime());
	   System.out.println(ans/(60*1000));
   }
}
