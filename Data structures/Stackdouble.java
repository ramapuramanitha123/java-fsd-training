import java.util.Stack;

public class Stackdouble{
	
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Double> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(70.8);  
stk.push(15.1);  
stk.push(91.0);  
stk.push(18.20);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
stk.pop();
System.out.println("The peek element is " + stk.peek());  
System.out.println("The position of 15.1 in the stack is :" + stk.search(15.1));  
}
}