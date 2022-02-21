public class MethodOverriding2 {

	public static void main(String[] args) {
	GrandFather f=new Father();
      f.home();
      f.car();
      GrandMother  m=new Mother();

		m.move();
        m.eat();
		
	}

}

class GrandFather{
	
	public void home(){
		System.out.println("GrandFather's home");
	}
	public void car(){
		System.out.println("GrandFather's Car");
	}	
}
class Father extends GrandFather{
	
	public void home(){
		System.out.println("Father's home");
	}
	public void car() {
		System.out.println("Father's Car");		
	}	
}
class GrandMother{
void move(){
System.out.println("Iuse my stick to move");
}
void eat()

{
System.out.println("eat slowly");
}
}
class Mother extends GrandMother{
void move()
{
System.out.println("I can walk fast");
}
void eat()

{
System.out.println("eat fast");
}
}

