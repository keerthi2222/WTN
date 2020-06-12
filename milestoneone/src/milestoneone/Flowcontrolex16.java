package milestoneone;

public class Flowcontrolex16 {
public static void main(String args[])
{
	int num=Integer.parseInt(args[0]);
	int rem;
	while(num!=0)
	{
		rem=num%10;
		System.out.print(rem);
		num=num/10;
		
	}
}

}
