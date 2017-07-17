import java.util.*;
public class Hunter121 {
	 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number(only odd number start with 3)");
	int n=sc.nextInt();
	int mid=((n/2)+1);
	int space=((n/2)-2);int space1=((n/2)-2);
	int down=(96+mid);
	int c=(96+mid);int c1=97; int c2=96; int limit=-2;int down1=97;int down2=(96+mid);int i1=1;int i3=0;int limit2=n;
	for(int i=1;i<=mid;i++){
		c=(96+mid);c1=97+1;c2++;limit++;
		for(int j=i;j<=mid;j++){
			System.out.print((char)c+" ");
			c--;
		}
		if(i>2){				
			for(int s1=1;s1<=limit;s1++){
				System.out.print("  ");	
			}}
		if(i==1){
			for(int j=i;j<mid;j++){
				System.out.print((char)c1+" ");
				c1++;
			}}
		if(i>1){
			for(int s=1;s<=1;s++){
				System.out.print("  ");
			}}
		if(i>1){
			if(i>2){
				for(int s2=1;s2<=limit;s2++){
					System.out.print("  ");	
				}}
			for(int j=i;j<=mid;j++){
				System.out.print((char)c2+" ");
				c2++;
			}c2=96+i;}
		System.out.println();
	}
	for(int r=(mid+1);r<=n;r++){
	  down=(96+mid);down1=97+1;down2=(96+mid);i1++;i3++;down2=down2-i3;
      for(int j=(mid);j<=r;j++)
      {
      	System.out.print((char)down+" ");
      	down--;
      }
      if(r!=n){
			for(int s=1;s<=space;s++){
				System.out.print("  ");
			}space--;}
      if(r==n){
      	for(int k=mid;k<n;k++){
      	System.out.print((char)down1+" ");
      	down1++;
      }}
      if(r!=n){
			for(int s=1;s<=1;s++){
				System.out.print("  ");
			}}
     if(r!=n){
    	 if(r!=n){
 			for(int s=1;s<=space1;s++){
 				System.out.print("  ");
 			}space1--;}
      	for(int a=1;a<=i1;a++){
      		System.out.print((char)down2+" ");
      	down2++;}}
     System.out.println();
}
	 }
}
