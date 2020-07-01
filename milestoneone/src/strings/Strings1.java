package strings;

import java.util.Scanner;

public class Strings1 
{
	public static void main(String args[])
	{
		String str="madam";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
		System.out.println("palindrome");
		}
	else
	{
		System.out.println("Not apalindrome");
	}
	}
}
