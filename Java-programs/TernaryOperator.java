//a) Write a program to use a Ternary operator and find the largest of three numbers.

 class TernaryOperator
{  
public static void main(String args[])
{  
int a=10;  
int b=25;  
int c=15;
 int  grt = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 
System.out.println(grt);  
}
}  
