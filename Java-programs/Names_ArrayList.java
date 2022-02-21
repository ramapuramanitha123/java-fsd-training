public class Names_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> first_name = new ArrayList<String>();
		first_name.add("Lijin");
		first_name.add("Vipin");
		first_name.add("Akhil");
		System.out.println("First name is ="+first_name);
		
		ArrayList<String> second_name = new ArrayList<String>();
		second_name.add("Joy");
		second_name.add("Kumar");
		second_name.add("Suresh");
		System.out.println("Second name is ="+second_name);
		
		ArrayList<String> total= new ArrayList<String>();
		
		for(int i=0; i<first_name.size();i++) {
			
			total.add(first_name.get(i)+" "+second_name.get(i));
		}
		
		System.out.println("Full name is :");
		System.out.println("");
		
		for (String fullname : total) {
			System.out.println(fullname);
		}
		
	
	}}
