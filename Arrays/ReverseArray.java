
import java.util.*;

//In this code I have use the basic alogoritm to reverse the elements in an Array
public class ReverseArray {
    public static void Reverse(int numbers[]){
        int first = 0,last =numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int numbers[]={6,97,4,7,3};
        Reverse(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
}

