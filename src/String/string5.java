package String;

public class string5 
{
	public static void main(String[] args)
	{
		String s1="velocity";
		System.out.println(s1.substring(5));  //ity
		System.out.println(s1.substring(2, 5));    //loc 2-4
		
		
		String s2="my name is rahul";
		
		String [] ar =s2.split(" ");     //{ my(0)  name(1)  is(2) rahul(3)}
		
		System.out.println("-----------------");
		
		System.out.println(ar[2]);
		
		System.out.println("---print all data from string array---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}