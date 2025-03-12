package Classroom;

public class Person {
    private String name;
    private int age;
    private Adresa address;

    // Constructor
    public Person(String name, int age, Adresa address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Adresa getAddress() {
        return address;
    }


}
