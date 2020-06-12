package milestoneone;

public class Flowcontrolex12 {
	public static void main(String args[])
	{
		int number=Integer.parseInt(args[0]);
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}

}
