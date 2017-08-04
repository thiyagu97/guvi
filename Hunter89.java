import java.io.*;
import java.util.*;
public class Hunter89 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> ts=new TreeSet<String>();
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		System.out.println("Enter the no of user(seperating by comma)");
		String str=br.readLine();
		str=str.replaceAll("\\s+","");
		int count=0;
		Integer k=Integer.parseInt(br.readLine());
		String[] s=str.split(",");
		for(String word:s){
			ts.add(word);}
	for(String ans:ts){
		count=0;
		for(int i=0;i<s.length;i++){
			if(ans.equals(s[i]))
				count++;
			}
		tm.put(ans,count);
		}
	System.out.println("Output is : ");
	for(Map.Entry<String, Integer> map:tm.entrySet()){
		String key=map.getKey();Integer value=map.getValue();
		if(value>=k){
			System.out.println(key+" "+"("+value+")");
		}
	}
	}
 }
