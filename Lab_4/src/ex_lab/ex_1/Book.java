package ex_lab.ex_1;

public class Book {
    private String title;
    private String author;
    private String isbnCode;


    public Book(String title, String author, String isbnCode) {
        this.title = title;
        this.author = author;
        this.isbnCode = isbnCode;
    }

    public String getAuthor() {
        return author;
    }
    public String getIsbnCode() {
        return isbnCode;
    }
    public String getTitle() {
        return title;
    }
}
