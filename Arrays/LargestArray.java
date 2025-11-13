import java.util.*;

public class LargestArray {
    public static int largestArr(int number[]) {
     int largest = Integer.MIN_VALUE;

       for(int i=0; i<number.length; i++) 
       {
         if(largest < number[i])
         {
            largest = number[i];
         }
       }
       return largest;
    }
    public static void main(String  args[])  {
        int number[]= { 12, 6, 78, 43, 5, 9, 25};
        System.out.println("Largest value is :" + largestArr(number));
    }
}
