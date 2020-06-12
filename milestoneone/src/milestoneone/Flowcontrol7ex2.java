package milestoneone;

public class Flowcontrol7ex2 
{
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println(args[0].toUpperCase());
		else
			System.out.println(args[0].toLowerCase());
	}

}
