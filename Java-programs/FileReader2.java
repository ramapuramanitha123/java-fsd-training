import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
 
public class FileReader2
{
    public static void main(String[] args) throws IOException
    {
      try
 {
 FileReader   frd =new FileReader("E:ProgramOutputFile.txt");
BufferedReader buff=new BufferedReader(frd);
boolean b=buff.ready();
 System.out.println("Check Reader is ready or not(true/false)?:   "+b);

 System.out.println((char)buff.read());
 System.out.println((char)buff.read());
 System.out.println((char)buff.read());

buff.mark(0);
 System.out.println("mark invoked, printing after mark");
 System.out.println((char)buff.read());

buff.reset();

 System.out.println("Reset the reader: ");
 System.out.println((char)buff.read());
 System.out.println((char)buff.read());

 buff.close();
  frd.close();       
 } 
catch(FileNotFoundException e)
 {
      System.out.println("File Not Found");

    }
}
}