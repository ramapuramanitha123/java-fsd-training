import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
 
public class FileReader1
{
    public static void main(String[] args) throws IOException
    {
      FileReader fr = null; 

      try {

      fr=new FileReader("E:ProgramOutputFile.txt");

            char [] a = new char[10];
         fr.read(a,0,8);

         for(char c : a) 
          {
                System.out.print(c);   
            }
 } 
catch(FileNotFoundException e)
 {
      System.out.println("File Not Found");
          
 }
System.out.println("type of encoding: "+fr.getEncoding());
  fr.close();
    }
}