package strings;

public class Strings6 
{
	public static void main(String args[])
	{
		String a,b,c;
		a="hi";
		b="hello";
		int len_a=a.length();
		int len_b=b.length();
		if(len_a>len_b)
		{
			c=b+a+b;
		}
		else
			c=a+b+a;
		System.out.println(c);
	}

}
