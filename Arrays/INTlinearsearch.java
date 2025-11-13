import java.util.*;


public class INTlinearsearch {
    public static int linearsearch (int number[] , int key)
{
    for (int i = 0;i<number.length;i++){
        if (number[i] == key){
            return i;

        }
    }
        return -1;
    
}

public static void main(String args[]){
    int number[] = {6,8,3,45,86,9,22,1};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to search:");
    int key = sc.nextInt();
    int result = linearsearch(number , key);
    if (result == -1){
        System.out.println("Number not found");
    }
    else{
        System.out.println("Number found at index: " + result);
     }
}
}