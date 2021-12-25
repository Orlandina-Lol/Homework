class Person {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int wage;
    private int age;

    Person(String name, String position, String email, String telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + telephone + ", " + wage + ", " + age;
    }

}