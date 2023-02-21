package ExceptionHandling;

import java.security.GeneralSecurityException;

public class example6 
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];      //0 to 4
				
		try
		{
			ar[9]=15;     //risky code
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}	
		catch(Exception e)
		{
			System.out.println("generic exception handled");
		}
		
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}