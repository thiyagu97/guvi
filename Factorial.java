import java.io.*;
public class Factorial {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		Integer count=1;
		if(n==0){
			System.out.println(count);
		}
		else{
			for(int i=1;i<=n;i++){
				count=count*i;
			}
			System.out.println(count);
		}
	}
}
