import java.util.*;

public class NumPattern {
    public static void main (String  args[] ) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of lines to print numbers:");
        int n = sc.nextInt();
        
        for(int line=1; line<=n; line++) { 

            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
        
}
//Scanner sc= new Scanner(System.in);
        