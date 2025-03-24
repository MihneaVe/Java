package ex_lab.ex_1;

public class Library {
    private String name;
    private String address;
    private Book[] books;

    public Library(String name, String address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setName(String name) {
        this.name = name;
    }
}
