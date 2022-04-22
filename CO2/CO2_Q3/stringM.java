package oops;
import java.util.*;
import java.io.*;
public class stringM {

	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		System.out.println("size of string "+str.length());
		System.out.println("The index of a is "+str.indexOf('j'));
		System.out.println("character at position 4 is "+str.charAt(4));
		System.out.println("Compare function "+str.compareTo("java"));
		System.out.println("Contain function "+str.contains("in"));
		System.out.println("endswith function "+str.endsWith("a"));
	}
}