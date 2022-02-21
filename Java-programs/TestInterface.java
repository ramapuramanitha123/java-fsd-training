//2.Write a java program to implement an interface with two methods.
interface Car
{
void fast();
void weight();
}
class Maruthi implements Car
{
     public void fast()
	{
		System.out.println("maruthi goes fast");
	}
    public void weight()
	{
		System.out.println("Weight is more than 1500kg");
	}
}

class Bugatti implements Car
{
	
public void fast()
	{
		System.out.println("Bugatti goes very fast");
	}
	public void weight()
	{
		System.out.println("Weight of Bugatti is 1990kg");
	}
}
public class TestInterface {
	public static void main(String[] args)
	{
		
		Car c= new Bugatti();
		c.fast();
		c.weight();
		
		
	}
}