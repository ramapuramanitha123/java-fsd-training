import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
	
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Total No of Classes ");
a=scanner.nextInt();
		
System.out.println("Enter No. of Classes Attended");
b=scanner.nextInt();
c=(b/a)*100;
System.out.println("The percentage of class attended"+c);
if(c<75) {
	System.out.println("you are not eligible to attend the exam");
}

else {
	System.out.println("you are eligible to attend the exam");
}
	}

}