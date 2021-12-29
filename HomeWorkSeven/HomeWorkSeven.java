/**
 * Java.Level 1. Homework #7
 *
 * @author Marina Nikiforova
 * @version 28.12.2021
 */
class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Kuzya", 18),
            new Cat("Barsik", 15),
            new Cat("Pushok", 12)
        };

        Plate plate = new Plate(40); //тарелка

        for (Cat cat : cats) {
            cat.eat(plate); //кот ест
        }

        plate.addFood(20);   //добавляется еда
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}



