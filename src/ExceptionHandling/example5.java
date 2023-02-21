package ExceptionHandling;

public class example5 
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];      //0 to 4
				
		try
		{
			ar[9]=15;     //risky code
		}
		catch(Exception e)
		{
			System.out.println("generic exception handled");
			e.printStackTrace();
			
		}
	
		
		System.out.println("Hi");
		System.out.println("Hello");
		
	}

}