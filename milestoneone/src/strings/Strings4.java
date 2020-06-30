package strings;

public class Strings4 
{
	public static void main(String args[])
	{
		String str1="TomCat";
		String str2=null;
		int len=str1.length();
		int n=len/2;
		if(len%2==0)
		{
			str2="";
			for(int i=0;i<n;i++)
			{
				str2=str2+str1.charAt(i);
			}
			System.out.println(str2);
		}
		else
			System.out.println(str2);
	}

}
