/*The Arrays.sort(names) method sorts the names array alphabetically. 
This step is crucial, as binary search relies on a sorted data structure to function correctly. 
The Arrays.binarySearch(names, target) method is then used to perform the binary search for the target string within the sorted array. 
If the target string is found, its index is returned; otherwise, 
a negative value is returned indicating that the string is not present in the array. */

import java.util.*;

public class StringBinarySearch {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        // The array must be sorted for binary search to work correctly
        Arrays.sort(names); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to search:");
        String target = sc.nextLine();
        int index = Arrays.binarySearch(names, target);

        if (index >= 0) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found.");
        }
    }
}