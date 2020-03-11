package interpreterpattern;

public class StringReverse implements Pattern
{
	public String conversion(String str)
	{
		StringBuilder strrev= new StringBuilder();

		for(int i=str.length()-1;i>=0;i--)
		{
			strrev=strrev.append(str.charAt(i));
		}
		
		return strrev.toString();
	}

}
