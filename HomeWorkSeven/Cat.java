class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    void eat(Plate plate) {
        if (plate.haveEnoughFood(appetite) && !satiety) {  //satiety = false;(тарелка полна. кот голоден)
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " eating");
        } else if (!plate.haveEnoughFood(appetite)) {      //тарелка пуста, кот не ест)
            System.out.println(name + " does not eat because there is little food");
        } else if (satiety) {                              //кот сыт
            System.out.println(name + " is full");
        }
    }
}