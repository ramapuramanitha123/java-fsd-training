import java.util.*;
class SubString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1:");
		String s1=sc.next();
		System.out.println("Enter string 2:");
		String s2=sc.next();
		if(s1.contains(s2))
		{
			System.out.println(s2+ " -is a substring of- " +s1);
		}
		else{
			System.out.println(s2+ " -is not a substring of- "  +s1);
		}
	}
}
