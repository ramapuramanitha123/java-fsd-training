import java.util.Stack;

public class Stackstring{
	
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<String> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push("hi");  
stk.push("hello");  
stk.push("good morning");  
stk.push("hello world");  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
stk.pop();
System.out.println("The last element is " + stk.peek());  
System.out.println("The position of good morning in the stack is :" + stk.search("good morning"));  
}
}