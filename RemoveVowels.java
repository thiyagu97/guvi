import java.io.*;
public class RemoveVowels {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int j=0,h=0;String ans,ans1;
		char[] c=new char[name.length()];
		char[] c2=new char[name.length()];
		char[] c1=name.toCharArray();
		for(int i=(c1.length)-1;i>=0;i--){
			c[j]=c1[i];
			j++;
		}
		ans=String.valueOf(c);
		System.out.println(ans);
		for(int k=0;k<c.length;k++){
			if(c[k]=='a'||c[k]=='e'||c[k]=='i'||c[k]=='o'||c[k]=='u'||
					c[k]=='A'||c[k]=='E'||c[k]=='I'||c[k]=='O'||c[k]=='U'){
				continue;
			}
			else{
				c2[h]=c[k];
				h++;
			}
			}
		ans1=String.valueOf(c2);
		System.out.println(ans1);
	}

}
