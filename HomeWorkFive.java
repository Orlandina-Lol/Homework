/**
 * Java.Level 1. Homework #5
 *
 * @author Marina Nikiforova
 * @version 25.12.2021
 */

class HomeWorkFive {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("W.A. Voronin", "Engineer", "voronin@mail.ru", "(+79274925578)", 105240, 37),
                new Person("M.T. Petrova", "QA-Engineer", "petrova@list.ru", "(+79033609823)", 75300, 28),
                new Person("G.R. Goncharov", "Designer", "goncharov@mail.ru", "(+79698629845)", 80250, 24),
                new Person("A.A. Lavrov", "Designer", "lavrov81@gmail.com", "(+79703268854)", 80250, 40),
                new Person("T.A. Gavrilenko", "HR", "t.gavrilenko@mail.ru", "(+790587394545)", 53080, 45)
        };

        for (Person person : persons) {
            if (person.getAge() >= 40) {
                System.out.println(person);
            }
        }
    }
}

