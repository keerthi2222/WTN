package milestoneone;

public class Arrays11 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,4,1,4};
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=1&&a[i]!=4)
			{
				break;
			}
		}
		if(i>=a.length)
			System.out.println("True");
		else
			System.out.println("false");
	}

}
