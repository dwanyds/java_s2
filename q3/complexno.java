package dwanyjava;

import java.util.Scanner;

public class complexno {

	public static void main(String args[])
	{
		int a,b,a2,b2,i,j;
		Scanner o=new Scanner(System.in);
		System.out.println("enter the real part of 1st no ");
		a=o.nextInt();
		System.out.println("enter the imaginery part 1st no");
		a2=o.nextInt();

		System.out.println("enter the real part of 2nd no ");
		b=o.nextInt();
		System.out.println("enter the imaginery part 2st no");
		b2=o.nextInt();
		
		System.out.println("first no:"+a+"+i"+a2);
		System.out.println("second no:"+b+"+i"+b2);
		int sum1=a+b;
		int sum2=a2+b2;
		System.out.println("sum of thenumbers is:"+sum1+"+i"+sum2);
		
	}
}
