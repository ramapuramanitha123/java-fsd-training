//b) Write a program to use a Ternary operator and find the smallest of three numbers.

 class TernaryOperator1
{  
public static void main(String args[])
{  
int a=10;  
int b=25;  
int c=15;
 int  sml = c < (a < b ? a : b) ? c : ((a < b) ? a : b); 
System.out.println(sml);  
}
}  
