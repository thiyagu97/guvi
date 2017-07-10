import java.util.*;
public class MultipleTable {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int value;
    	System.out.println("Enter the tables");
    	int n=sc.nextInt();
    	for(int i=1;i<=20;i++){
    		value=i*n;
    		System.out.println(i+"*"+n+"="+value);
    	}
    }
}
