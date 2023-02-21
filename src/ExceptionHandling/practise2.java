package ExceptionHandling;

public class practise2 {
	public static void main(String[] args) {
String s1="velocity";   //0 to 7
		
		try
		{
			System.out.println(s1.charAt(9));	   //risky code
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
