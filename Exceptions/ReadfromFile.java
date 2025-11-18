import java.io.FileReader;
import java.io.BufferedReader;

public class ReadfromFile{

public static void main(String[] args)
{
        try
{
    FileReader fr=new FileReader("exception.java");
    BufferedReader br=new BufferedReader(fr);
    String i;

    while((i=br.readLine())!=null) 
    {
        System.out.println(i);
    }
}
    catch(Exception e) {
    System.out.println(e);
}
}
}
 