import java.util.*;

public class Starpatern {
    public static void main (String  args[] ) {
        int n=6;

        for(int line=1; line<=n; line++) { 

            for(int stars =1; stars<=line; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
}
//Scanner sc= new Scanner(System.in);
        