package milestoneone;

public class Flowcontrolex14 {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int rem,value=0;
		while(num!=0)
		{
			rem=num%10;
			value=value+rem;
			num=num/10;
		}
		System.out.println(value);
	}

}
