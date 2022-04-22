package oops;
import java.util.*;
 class cpu1 {
	int price;
	Scanner sc=new Scanner(System.in);

	void read()
	{
	System.out.println("enter the price of the cpu");
	price=sc.nextInt();

	}
	void display()
	{
	System.out.println("the price of the cpu is "+price);
	}
	public class processor
	{
	int core;
	String manuf;
	void read()
	{
	System.out.println("enter the cores of the processor");
	core=sc.nextInt();
	System.out.println("enter the manufacturer of the processor");
	sc.nextLine();
	manuf=sc.nextLine();

	}
	void display()
	{
	System.out.println("the core of the processor is"+core+"\nthe manufacturer of the processor is "+manuf);
	}

	}
	public static class ram
	{
	public static int memory;
	public static String manufacturer;
	Scanner sc=new Scanner(System.in);
	void read()
	{
	System.out.println("enter the size of memory");
	memory=sc.nextInt();

	System.out.println("enter the manufacturer");sc.nextLine();
	manufacturer=sc.nextLine();

	}
	void display()
	{
	System.out.println("size of the memory is "+memory+" and the manufacturer is "+manufacturer);

	}
	}

 }
	
	public class cpu
	{
	public static void main(String args[])
	{
	cpu1 obj =new cpu1();
	obj.read();
	
	cpu1.processor obj2=obj.new processor();
	
    obj2.read();
	obj.display();
	obj2.display();
	
	cpu1.ram obj3=new cpu1.ram();
	obj3.read();
	obj3.display();
	}
	}
	


