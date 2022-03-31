package dwanyjava;
import java.util.*;
public class matrix2 {
	public static void main(String args[])
	{
		int n1,i,j,flag;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of the matrix\n");
		n1=obj.nextInt();
		System.out.println("enter the elements of the matrix\n");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=obj.nextInt();
				
			}
		}
		
		System.out.println("the matrix is\n");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(a[i][j]+"\t");
						
				}
				System.out.println("");
			}
		
			
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n1;j++)
				{
					b[i][j]=a[j][i];
					
				}
			}
			System.out.println("the transpose matrix is\n");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(b[i][j]+"\t");
						
				}
				System.out.println("");
			}
		  
			flag=1;
			
				for(i=0;i<n1;i++)
				{
					for(j=0;j<n1;j++)
					{
						if(a[i][j]!=b[i][j])
						{
							flag=0;
							break;
						}
						
					}
				}
				if(flag==1)
			
				{
					System.out.println("it is symmetric");
					
				}
				else
				{
					System.out.println("it is not symmetric");
				}
			
			
	}

}
