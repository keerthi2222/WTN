package milestoneone;

public class Arrays13 
{
	public static void main(String args[])
	{
		int n=args.length;
		int  a[][]=new int[4][4];
		int max=a[0][0];
	int i,j;
	if(n<9)
	{
		System.out.println("Please enter the 4 elements");
	}
	if(n==4)
	{
		int k=0;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			a[i][j]=Integer.parseInt(args[k]);
			k++;
			}
	}
	System.out.print("The given array is:\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}
	System.out.println("The reverse array is:\n");
	for(i=1;i>=0;i--)
	{
		for(j=1;j>=0;j--)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}
	}

	