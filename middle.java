package even;
import java.util.*;

public class even
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter arry length");
		x=sc.nextInt();
		System.out.print("Enter element of arry");
		int A[]=new int[10];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("you have enterd a arrys are");
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("middle element in arry is");
		for(int i=4;i<A[5];i++)
		{
			
				System.out.print(A[i]+",");
			
		}
	}
}






























