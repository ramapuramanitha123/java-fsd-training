import java.util.ArrayList;

public class CollectionsExmp2 {
	public static void main(String[] args) {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		sum.add(12);
		sum.add(30);
		sum.add(50);
		sum.add(34);
		sum.add(56);
	   System.out.println("Elements of ArrayList: "+sum);
	   int SUM =0;
	   int avg = 0;
	   int total=0;
	   for(int i : sum) SUM += i;
	   System.out.println("Sum of the the elements is: "+SUM);
		   avg = SUM / sum.size();
		   System.out.println("Average is: "+avg);
	 
	   

}
}
