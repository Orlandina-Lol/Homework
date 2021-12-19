/**
* Java.Level 1. Homework #3
*
* @author Marina Nikiforova
* @version 16.12.2021
*
*/
import java.util.Arrays;

class HomeWorkThree {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        multiplyNumbersInArray();
        fillDiagonal();
        int[] mass = retArr(12, 5);
        System.out.println(Arrays.toString(mass));
    }
    
    static void invertArray() {
    int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    System.out.println();
    int n = arr.length;
    int temp;
    
    for (int i = 0; i < n/2; i++) {
        temp = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    System.out.println();
    }
    
    static void fillArray() {
    int[] massiv = new int [100];
    for (int i = 1; i < massiv.length; i++) {
        massiv[i] = i;
        System.out.print(massiv[i]);
    }
    System.out.println();
    }
    
    static void multiplyNumbersInArray() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
        arr[i] = (arr[i]) * 2;
        }
    }
    System.out.print(Arrays.toString(arr));
    System.out.println();
    } 
    
    
    static void fillDiagonal() {
    int[][] table = new int[3][3];
    for (int i = 0; i < table.length; i++) { 
        for (int j = 0, x = table[i].length- 1; j < table[i].length; j++, x--) {
            if (i == j || i == x) table[i][j] = 1;
            else table[i][j] = 0;
            System.out.print(table[i][j] + " ");
        }
            System.out.print("\n");
    }
    }
    static int[]retArr(int len, int initialValue) {
        int[] mass = new int [len];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = initialValue;
        }
        return mass;
    }
}