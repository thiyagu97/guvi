import java.io.*;
public class BigNumber {
	public static void main(String[] args)throws IOException{
  	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	  Integer a=Integer.parseInt(br.readLine());
  	 Integer b=Integer.parseInt(br.readLine());
  	 Integer c=Integer.parseInt(br.readLine());
  	 int max=a;
  	 int[] n={a,b,c};
  	 for(int i=0;i<3;i++){
  		 if(max<n[i]){
  			 max=n[i];
  		 }
  	 }
  	 System.out.println(max);
	}
}
