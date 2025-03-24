package Classroom;


public class Adresa{
    private String street;
    private int number;
    private String city;
    private String country;


    // Constructor
    public Adresa(String string, int i, String string2, String string3) {
        this.street = string;
        this.number = i;
        this.city = string2;
        this.country = string3;
    }


    // Getters
    public String getStreet() {
        return street;
    }
     
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getNumber() {
        return number;
    }

}
