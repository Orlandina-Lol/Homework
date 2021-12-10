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
         if (a + b >= 0) {
             System.out.println ("Sum is positive");
         } else {   
             System.out.println ("Sum is negative");
         }
     }
     static void printColor() {
         int value = 101;
         if (value <= 0) {
             System.out.println ("Red");
         }
         if  (value >0 && value <=100) {
             System.out.println ("Yellow");
         }
         if  (value >100) {
             System.out.println ("Green");
         }  
     }
     
     static void compareNumbers() {
         int a = 2;
         int b = 3;
         if  (a >= b) {
             System.out.println ("a >=b");
         } else {
             System.out.println ("a < b");
         }             
     }
}