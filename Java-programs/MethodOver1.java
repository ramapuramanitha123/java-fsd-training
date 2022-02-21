//1. Method Overloading by changing the no of arguments....//


public class MethodOver1 {

	static void disp(int a) {
		System.out.println(a*a);
	}
	
	static void disp(int a, int b,int c) {
		System.out.println(a+b+c);
	}

	static void disp(int a, int b) {
		System.out.println(a*b);
	}
	
	static void disp() {
		System.out.println("Null Value");
	}
	
	
	public static void main(String[] args) {
		disp(2);
		disp(2,4,2);
		disp(10,5);
		disp();
		

	}

}
