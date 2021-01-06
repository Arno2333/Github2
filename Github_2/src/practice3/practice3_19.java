package practice3;
import java.util.Scanner;

public class practice3_19 {
	public static void main(String[] args) {
		System.out.print("请输入三条边的长度:");
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if((a+b>c) && (b+c>a) && (a+c>b))
			System.out.println("周长是:"+(a+b+c));
		else
			System.out.println("输入的值不合法");
	}

}
