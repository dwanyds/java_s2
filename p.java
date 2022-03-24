
package dwanyjava;
import java.util.*;
public class p {
	public static void main(String args[])
	{
		
	product fst=new product();
	product snd=new product();
	product trd=new product();
	if(fst.price>snd.price && fst.price>trd.price)
	{
		System.out.println(fst.price+"is the largest");
	}
	else if(snd.price>fst.price && snd.price>trd.price)
	{
		System.out.println(snd.price+"is the largest");
	}
	else if(trd.price>fst.price && trd.price>snd.price)
	{
	System.out.println(trd.price+"is the largest");
	}
	}
}
	class product
	{
		int pcode;
		String pname;
		int price;
		product()
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("enter the product name");
			pname=ob.nextLine();
			System.out.println("enter the product code");
			pcode=ob.nextInt();
			System.out.println("enter the product price");
			 price=ob.nextInt();
			 
			System.out.println(" product name:"+pname+"\n code:"+pcode+"\nprice:"+price);		
		}
		
	}


