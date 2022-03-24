package dwanyjava;
import java.util.*;
public class matrix {
	
public static void main(String args[])
{
  int i ,j;
	int arr1[][]=new int[50][50];
	int arr2[][]=new int[50][50];
	int sum[][]=new int[50][50];
	Scanner m= new Scanner(System.in);
	System.out.println("enter the first matrix\n");
	for(i=0;i<=1;i++)
	{
		for(j=0;j<=1;j++)
		{
			arr1[i][j]=m.nextInt();
	}	
}
System.out.println("eneter the second matrix\n");
for(i=0;i<=1;i++)
{
	for(j=0;j<=1;j++)
	{
		arr2[i][j]=m.nextInt();
}	
}
for(i=0;i<=1;i++)
{
	for(j=0;j<=1;j++)
	{
		sum[i][j]=arr1[i][j]+arr2[i][j];
}	
}
System.out.println("Sum of the matrix is\n");
for(i=0;i<=1;i++)
{
	for(j=0;j<=1;j++)
	{
		System.out.print(sum[i][j]);
}	
	System.out.println();
}
	
}

}
