package practice3;
import java.util.Scanner;
public class practice3_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first 9 digits of ISBN as intager: ");
		 int numbers=input.nextInt();
	        int d1=numbers/100000000;
	        int d2=numbers/10000000%10;
	        int d3=numbers/1000000%10;
	        int d4=numbers/100000%10;
	        int d5=numbers/10000%10;
	        int d6=numbers/1000%10;
	        int d7=numbers/100%10;
	        int d8=numbers/10%10;
	        int d9=numbers%10;
	        int d10=(d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
	        if (d10==10){
	        	System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
	        }
	                else
	                	System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 +"" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10);
	}
}
