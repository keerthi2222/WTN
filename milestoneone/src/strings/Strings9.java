package strings;

public class Strings9 
{
	public static void main(String args[])
	{
		String str1="Hello";
		String str2="World";
		String str="";
		int str1len,str2len,strlen,i=0,len;
		str1len=str1.length();
		str2len=str2.length();
		len=(str1len+str2len);
		len=Math.min(str1len, str2len);
		while(i<len)
		{
			str=str+str1.charAt(i)+str2.charAt(i);
			i++;
		}
		if(len==str1len)
		{
			if(str1len!=str2len)
			{
				str=str+str2.substring(len-1);
			}
			else
				str=str+str1.substring(len-1);
			System.out.println(str);
		}
	}

}
