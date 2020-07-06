package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter the elements in the array:");
		try
		{
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
				System.out.println("Enter indexof the array elements you want to access");
				int index=sc.nextInt();
					System.out.println("the array element at index" + index + "=" + arr[index]);
		            System.out.println("the array elements successfully accessed");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		sc.close();
	}

}
