package String;

public class string4 {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is rahul";
		String s5="abcabcab";
		String s6="";
		//System.out.println(s1.substring(5));//ty  index chya pudche print
		//System.out.println(s1.substring(3, 6));
		System.out.println(s6.isEmpty());//true
		System.out.println(s1.isEmpty());//false
		System.out.println(s4.replace("rahul", "abc"));
		System.out.println(s2+s3);
		System.out.println(s2.concat(s3));
System.out.println("----------------------");
		
		System.out.println(s1.length());    //8
		System.out.println(s1.toUpperCase());    //VELOCITY
		System.out.println(s2.toLowerCase());   //abcd
		System.out.println(s2.equals(s3));   //  false //compare data & case
		System.out.println(s2.equalsIgnoreCase(s3));  // true   //non-case sensitive
		
		System.out.println("----------------------------");
		System.out.println(s4.contains("name"));  //true
		System.out.println(s4.startsWith("my"));  //true
		System.out.println(s4.endsWith("rahul"));  //true
		System.out.println(s1.charAt(4));  //c
		System.out.println(s5.indexOf('c'));   //2
		System.out.println(s5.lastIndexOf('c'));  //5
	}


	}


