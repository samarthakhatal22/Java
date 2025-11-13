

import java.util.*;

public class PairsInArray {
    public static void pairs(int number[]){
        int tp=0;                ///to print total pairs formed.
        for(int i = 0; i<number.length;i++){
            int current = number[i];
            for (int j = i+1;j<number.length;j++){
                System.out.print("[" + current + "," + number[j]+ "] ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs:" + tp);
    }
    public static void main(String[] args) {
        int number[]={12, 22, 6, 8, 1};
        System.out.println("The pairs in the array are:"); 
        pairs(number);
    }
}