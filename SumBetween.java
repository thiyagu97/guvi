public class SumBetween {
    public static void main(String[] args){
    	int sum2=0,sum1=0;
    	for(int i=1;i<=15;i++)
    		sum1=sum1+i;
    	for(int i=15;i<=45;i++){
    		if(i%2!=0)
    			sum2=sum2+i;
    	}
    	System.out.println("Sum of Numbers from 1 to 15 is "+sum1);
    	System.out.println("Sum of Odd Numbers from 15 to 45 is "+sum2);
    }
}
