import java.io.IOException;
class Except extends Exception
{
int a=0;
}

class exception
{
static void show() throws Exception
{
System.out.println("show");
throw new Except();   
}
public static void main(String[] args)
{
int a=20;
try{
show();
System.out.println("try");
}
catch(Exception e)
{
System.out.println(e);
}
finally
{System.out.println("finally");}
System.out.println(a);
}
}