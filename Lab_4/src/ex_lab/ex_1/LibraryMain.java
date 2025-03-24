package ex_lab.ex_1;

public class LibraryMain {
    public static void main(String[] args) {
        Book bookOne = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book bookTwo = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book bookThree = new Book("1984", "George Orwell", "9780451524935");
        Book[] books = {bookOne, bookTwo, bookThree};
        
        Library library = new Library("Library of Congress", "101 Independence Ave SE, Washington, DC 20540", books);
        System.out.println("Library name: " + library.getName());
        System.out.println("Library address: " + library.getAddress());
        System.out.println("Books in the library: ");
        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN Code: " + book.getIsbnCode());
            System.out.println();
        }
    }
}
