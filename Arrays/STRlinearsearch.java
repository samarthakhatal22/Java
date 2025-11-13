import java.util.*;
public class STRlinearsearch {
    public static int linearsearch(String items[], String key) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String items[] = {"apple", "banana", "grape", "orange", "mango"};
        System.out.print("Enter the item to search:");
        String key = sc.nextLine();
        int result = linearsearch(items, key);
        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index: " + result);
        }
        sc.close();
    }
}