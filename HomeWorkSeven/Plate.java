class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int appetite) {    //метод проверки хватает ли еды
        if (!haveEnoughFood(appetite)) {
        } else {
            food -= appetite;
        }
    }

    boolean haveEnoughFood(int appetite) {   //метод для возвращения если еды достаточно
        return appetite < food;
    }

    void addFood(int countFood) { //метод для добавления еды)
        food += countFood;
    }
}