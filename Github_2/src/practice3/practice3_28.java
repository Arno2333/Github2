package practice3;
import java.util.Scanner;

public class practice3_28 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinates,width,and height:");
        double r1_xCoordinates=input.nextDouble();
        double r1_yCoordinates=input.nextDouble();
        double r1_width=input.nextDouble();
        double r1_height=input.nextDouble();
        System.out.print("Enter r2's center x-,y-coordinates,width,and height:");
        double r2_xCoordinates=input.nextDouble();
        double r2_yCoordinates=input.nextDouble();
        double r2_width=input.nextDouble();
        double r2_height=input.nextDouble();
        if(Math.abs(r1_xCoordinates-r2_xCoordinates)>(r1_width/2+r2_width/2)&&Math.abs(r1_yCoordinates-r2_yCoordinates)>(r1_height/2+r2_height/2)){
            System.out.println("r2 does not overlap r1");
        }else if(Math.abs(r1_xCoordinates-r2_xCoordinates)<=(Math.abs(r1_width-r2_width))*0.5&&Math.abs(r1_yCoordinates-r2_yCoordinates)<=(Math.abs(r1_height-r2_height))*0.5){
            System.out.println("r2 is inside r1");
        }else
            System.out.println("r2 overlaps r1");
        }
}
