package strings;

public class Strings3 
{
	public static void main(String args[])
	{
		String str="Wipro";
		String str1="";
		int len=str.length();
		if(len<=1)
		{
			str1=str;
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				str1=str1+str.charAt(0)+str.charAt(1);
			}
		}
		System.out.println(str1);
	}

}
