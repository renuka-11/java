class OverloadDemo {
	void test() {
	  System.out.println("....No parameters....");
	  }
	    void test(int a) {
	    System.out.println("....One integer parameter...."+a);
	    }
	    void test(int a,int b) {
	    System.out.println("....TWo integer parameter...."+a+","+b);
	    }
	    void test(double a) {
	    System.out.println("....One double parameter...."+a);
	    }
	 }
	 class Overload {
	     public static void main(String args[]) {
	       OverloadDemo ob=new OverloadDemo();
	       ob.test();
	       ob.test(10);
	       ob.test(10,20);
	       ob.test(2,3);
	       }
	     }
