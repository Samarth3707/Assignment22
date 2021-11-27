package Arry3;
import java.util.*;

public class Arry3 
{
	public static void main(String[] args)
	{
	    int x,sum=0,sum2=0;
	   
		Scanner sc = new Scanner(System.in);
		System.out.print("enter arry length");
		x=sc.nextInt();
		System.out.print("enter arry element");
		int A[]=new int[x];
		for(int i=0;i<x;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("positive numbers are");
		
		for(int i=1;i<x;i=i+2)
		{
			System.out.print(A[i]);
			System.out.println();
			
			
			
		}
		System.out.println("Sum of all even nos are");
		for(int i=1;i<x;i=i+2)
		{
			sum=sum+A[i];
		}
		System.out.print(sum);
		System.out.println();
		System.out.println("odd nos are");
		for(int i=0;i<x;i=i+2)
		{
			System.out.println(A[i]);
		}
		System.out.println("addition of odd nos are");
		for(int i=0;i<x;i=i+2)
		{
			sum2=sum2+A[i];
		}
		System.out.print(sum2);
		System.out.println();
		System.out.println("1st three nos are");
		for(int i=0;i<x;i++)
		{
			if(i<=2)
			{
				System.out.print(A[i]);
			}
		}
		System.out.println();
		System.out.println("last 3 nombers");
		for(int i=0;i<x;i++)
		{
			if(i>=7)
			{
				System.out.print(A[i]);
			}
		}
		
	}
	
		
}
