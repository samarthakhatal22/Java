import java.util.*;

public class SmallestArray {
    public static int smallestArr( int numbers[]) {
        int smallest = Integer.MAX_VALUE;
          
          for(int i =0; i< numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
          }
          return smallest;
    }
    public static void main (String  args[]){
        int numbers[] = {72, 98, 56, 23, 66, 49, 55};
        System.out.println("Elements in array are:"  + (Arrays.toString(numbers)));
        System.out.println("Smallest number is: " +smallestArr(numbers));

    }
}
