package milestoneone;

public class Flowcontrolex6 {
	public static void main(String args[])
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equalsIgnoreCase("Female"))
		{
			if(age>=1&&age<=58)
				System.out.println("Interest=8.2%");
			if(age>=59&&age<=100)
				System.out.println("Interest=9.2%");
		}
		else
		{
			if(age>=1&&age<=58)
				System.out.println("Interest=8.4%");
			if(age>=59&&age<=100)
				System.out.println("Interest=10.5%");
		}
	}

}
