package ExceptionHandling;
public class example3 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		int div;     //  10/0 = 
			
		try
		{
			div=a/b;   //risky code
		}
		catch (ArithmeticException e)
		{
			div=a/5;      //alternate code
			System.out.println("Arithmetic Exception handled");
		}
		
		System.out.println(div);
		
		System.out.println("good morning");
			
	}

}