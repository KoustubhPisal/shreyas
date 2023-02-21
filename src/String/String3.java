package String;

public class String3 
{
	public static void main(String[] args)
	{
		//obj creation of string
		//without new keyword--Constant Pool Area
		
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
		//using new keyword ---Non Constatnt Pool Area
		String s4=new String("abc");
		String s5 =new String("abc");
		String s6=new String ("abc1");
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println(s4);
		 System.out.println(s5);
		 System.out.println(s6);
		 System.out.println(s1==s3);
		 System.out.println(s1==s2);
		
		
	}

}
