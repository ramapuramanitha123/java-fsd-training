// Method Overloading by changing the datatypes//


public class MethodOver2 {
	
	static void disp(String myText,int a, double b) {
		System.out.println(myText+" " +a*b);
	}

	
	static void disp(char c, int num)  
    {
         System.out.println(c+" "+num);
    }
	
	
	static void disp(char a, char b)  
    {
         System.out.println(a+" "+b);
    }

	
	static void disp(String Text, int c)  
    {
         System.out.println(Text+" "+c);
    }
	
	
	public static void main(String[] args) {
		disp("Addition of a+b is =",10, 12.3);
		disp('k',10);
		disp('a','b');
		disp("hello",10);
	}
}
