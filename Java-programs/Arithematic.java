import java.util.Scanner;
import java.io.*;
class Arithematic

{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a,b,c,d,e,f,g;
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
d=a-b;
e=a*b;
f=a/b;
g=a%b;
System.out.println("add of a and b"+ c);
System.out.println("sub of a and b"+ d);
System.out.println("mul of a and b"+ e);
System.out.println("div of a and b"+ f);
System.out.println("reminder is"+ g);
}
}


