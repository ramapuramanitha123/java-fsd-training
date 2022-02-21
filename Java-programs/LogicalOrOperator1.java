//4. Write a java program to evaluate two statements each using Logical OR  operator.
import java.util.Scanner;
 class LogicalOrOperator1
{  
public static void main(String args[])
{  
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=Sc.nextInt();
 if(n>=1||n<=12)
System.out.println(n+" month number is valid");  
else 
System.out.println(n+"  month number is invalid");  
}
}

