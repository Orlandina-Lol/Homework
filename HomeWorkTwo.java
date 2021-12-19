/**
* Java.Level 1. Homework #2
*
* @author Marina Nikiforova
* @version 13.12.2021
*
*/

class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(checkSumm(5, 5));
        printPositiveorNegative (36) ;
        System.out.println(checkNambNegativ(15));
        repitWord ("word", 4);
    }
    static boolean checkSumm(int a, int b) {
        return (a + b) >=10 && (a + b) <=20;
    }
    
    static void printPositiveorNegative(int a) {
        System.out.println((a >= 0? "positive" : "negative"));
    }
    
    static boolean checkNambNegativ(int a) {
         return a < 0; 
    }
    static void repitWord(String w, int x) {
        for (int a = 0; a < x; a++) {
               System.out.println(w);
        }
    }    
}