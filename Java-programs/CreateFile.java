import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class CreateFile
{
public static void main(String[] args)throws IOException
{
String str="Ding Dong Bell ";
 String str1="Good Morning";

FileWriter f=new FileWriter("E:ProgramOutputFile.txt");
BufferedWriter bf=new BufferedWriter(f);

for(int i=0;i<str.length();i++)
{
bf.write(str.charAt(i));
}

f.write("\n");
char[] c={'a','b','c'};
f.write(c);
f.write("\n");
f.write(str1,0,5);

f.append("sun is good day");
f.append(str,4,8);
f.write("\n");
f.write('a');

System.out.println(f.getEncoding());

f.write("\n");

bf.flush();
f.close();
System.out.println("Finished writing");
}
}