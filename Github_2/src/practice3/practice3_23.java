package practice3;
import java.util.Scanner;

public class practice3_23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		if((x>=-5)&&(x<=5)&&(y>=-2.5)&&(y<=2.5))
			System.out.println("Point("+ x +","+ y +") is in the retangle");
		else
			System.out.println("Point("+ x +","+ y +") is not in the retangle");
	}

}
