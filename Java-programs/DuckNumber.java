
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  

public class DuckNumber {  
  
   
   public static boolean checkNumber(int number) {  
    
      while(number != 0) {  
    
         if(number%10 == 0)  
            return true;      
  
         number = number / 10;  
      }  
  
      return false;  
   }  
   
    public static void main(String args[])   
    {     
        int n1;  
            
        Scanner sc=new Scanner(System.in);  
            
        System.out.println("Enter a number");  
            
        n1 = sc.nextInt();
          
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Duck number");   
        else  
            System.out.println(n1 + " is not a Duck number");   
    }  
}  