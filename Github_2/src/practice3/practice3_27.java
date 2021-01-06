package practice3;
import java.util.Scanner;

public class practice3_27 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		float x = input.nextFloat();
		float y = input.nextFloat();
		if((x>=0)&&(y>=0)&&(y<=-0.5*x+100)) 
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");	
	}

}
