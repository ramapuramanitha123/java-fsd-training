import java.util.Scanner;
class MStrongnum
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
Strong sg=new Strong();
boolean rs=sg.isStrong(n);
if(rs==true)
System.out.println(n+"is a strong number");
else
System.out.println(n+"is not a strong number");
}
}
class Strong
{
boolean isStrong(int n)
{
int sum =0,t=n;
do{
int r=n%10;
sum=sum+fact(r);
n=n/10;
}while(n!=0);
if(sum==t)
return true;
else
return false;
}
int fact(int n)
{
int f=1;
while(n>1)
{
f=f*n;
n--;
}
return f;
}
}


