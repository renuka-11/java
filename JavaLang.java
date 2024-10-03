public class JavaLang {
  public static void main(String args[]) {
  	//using object class methods
	Object obj1 = new Object();
	Object obj2 = new Object();
	System.out.println("Objects are equal: " + obj1.equals(obj2));
	
	//using string class methods
	String str = "Hello, World!";
	System.out.println("String Length: " + str.length());
	System.out.println("Substring: " + str.substring(7, 12));
	
	//using System class
	System.out.println("Current time in milliseconds: " + System.currentTimeMillis());
	
	}
     }
    
