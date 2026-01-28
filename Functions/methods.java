//b.Methods and variables
import java.util.*;
    class Name {
    String name ;

      Name() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }
void display(){
    System.out.println("Hello " + name);
}
}
 
public class methods {
    public static void main(String[] args) {
        Name obj = new Name();
        obj.display();
    }
}
