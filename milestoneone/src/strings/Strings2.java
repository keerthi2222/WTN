package strings;

import java.util.Scanner;

public class Strings2
{
	public static void main(String args[])
	{
		String str1="Sachin ";
		String str2="Tendulkar";
		char ch1=str1.charAt(str1.length()-1);
		char ch2=str2.charAt(0);
		if(ch1==ch2)
		{
			String s=(str1.substring(0,str1.length()))+(str2.substring(1,str2.length()));
			System.out.println(s.toLowerCase());
		}
		else
		{
			String s=str1+str2;
			System.out.println(s.toLowerCase());
	}
	}

}
