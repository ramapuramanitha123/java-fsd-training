//1.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 

import java.util.Scanner;
class Primenum
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value");
int n=sc.nextInt();
int count=1,i=1;
while(i<=n/2)
{
if(n%i==0)
count++;
i++;
}
if(count==2)
System.out.println(n+"is prime number");
else
System.out.println(n+"is not a prime number");
}
}
