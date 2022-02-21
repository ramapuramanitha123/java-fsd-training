import java.util.Scanner;
class MFibnocci2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
Fibnocci ds=new Fibnocci();
ds.printFibnocci(n);
}
}
class Fibnocci
{
void printFibnocci(int n)
{
int f1=0,f2=1;
while(f1<=n)
{
System.out.println(f1+" ");
int f3=f1+f2;
f1=f2;
f2=f3;
n--;
}
}
}