/**
* Java.Level 1. Homework #1
*
* @author Marina Nikiforova
* @version 10.12.2021
*
*/

class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    
    static void checkSumSign() {
        int a = -10;
        int b = -15;
        System.out.println("Sum is " +(a + b >= 0? "positive" : "negative"));
    }

    static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println ("Red");
        } else if (value <=100) {
            System.out.println ("Yellow");
        } else if (value > 100) {
            System.out.println ("Green");
        }  
    }
     
    static void compareNumbers() {
        int a = 3;
        int b = 3;
        System.out.println("a" +(a >= b? ">=b" : "< b"));  
    }
}