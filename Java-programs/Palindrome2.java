public class Palindrome2 {

	public static void main(String[] args) {
	          int num, rem, reverse_num, temp;
                           for(num=0;num<=10;num++){
                              temp=num;
		 reverse_num=0;
		  while(temp!=0){
		     rem=temp%10;
		       temp=temp/10;
		         reverse_num=reverse_num*10+rem;
		      }
		      if(num==reverse_num)
		       
		      System.out.println(num);
		   }
	}

}