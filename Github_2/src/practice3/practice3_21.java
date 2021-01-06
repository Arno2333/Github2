package practice3;
import java.util.Scanner;

public class practice3_21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		int m = input.nextInt();
		if(m<3) {
			year=year-1;
			m=12+m;
		}
		System.out.println("Enter the day of the month: 1-31: ");
		int q = input.nextInt();
		System.out.println(q);
		int j = year/100;
		int k = year%100;
		int h = (q+(26*(m+1))/10+k+k/4+j/4+5*j)%7;
		if(h==2)
			System.out.println("Day of the week is Monday");
		else if(h==3)
			System.out.println("Day of the week is Tuesday");
		else if(h==4)
			System.out.println("Day of the week is Wednesday");
		else if(h==5)
			System.out.println("Day of the week is Thursday");
		else if(h==6)
			System.out.println("Day of the week is Friday");
		else if(h==0)
			System.out.println("Day of the week is Saturday");
		else if(h==1)
			System.out.println("Day of the week is Sunday");
		
	}

}
