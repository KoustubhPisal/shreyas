package ExceptionHandling;

public class example2 
{
	public static void main(String[] args)
	{
		String s1="velocity";   //0 to 7
		
		try
		{
			System.out.println(s1.charAt(9));	   //risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		
		System.out.println("Hi");
		System.out.println("Hello");
	}
}