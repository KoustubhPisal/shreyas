package String;
public class string1 {
public static void main(String[] args) {
	//OBJECT CREATION OF STRING
	
	//1.WITHOUT NEW KEYWORD
	String s1="shreyas07";
	System.out.println(s1);
	
	//2.WITH NEW KEYWORD
	String s2=new String("gopal");
	System.out.println(s2);
	
}
}
//1.String is non-primitive data type, memory size is not fixed.
//2. String is use to store collection of characters.
//3. String is a inbuilt/ready made class present inside "java.lang" package.
//4. String class is final class can't be inherited to other classes.
//5. At the time of String declaration, initialization, object creation takes place.
//6. String objects are immutable in nature/can't be change.
//7. Object creation of String can be done in 2 ways:
           //1. Without using new keyword
           //2. Using new keyword
//8. String objects are going to get stored inside String pool area which is present inside heap area.