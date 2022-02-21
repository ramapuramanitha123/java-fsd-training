//2.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

import java.util.Scanner;
class Multiplier
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value");
int n=sc.nextInt();
for(int i=1;i<=10;++i)
System.out.println(n + " * " + i + " = " + n * i);
}
}