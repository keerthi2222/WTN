package milestoneone;

public class Flowcontrolex17 {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int temp=num;
		int a=0,b;
		while(temp!=0)
		{
			b=temp%10;
			a=a*10+b;
			temp=temp/10;
		}
		if(num==a)
			System.out.println(num+"is a palindrome");
		else
			System.out.println(num+"is not a palindrome");
	}

}
