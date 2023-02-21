package ExceptionHandling;

public class example1 
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];      //0 to 4
				
		try
		{
			ar[9]=15;     //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}		
		
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}