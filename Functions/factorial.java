import java.util.Scanner;

public class factorial {
    public static int factorial1(int n)
    {
        int f=1;
         
        for(int i=1;i<=n;i++){
            f=f*i;
        }
    return f;
    }
       public static void main(String[] args) 
       {       
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.println("\nthe value of factorial is :");
        System.out.print(factorial1(n));

    }
}






