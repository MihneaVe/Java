package ex_lab.ex_2;
@SuppressWarnings({"unused", "StringEquality"})
public class StringMain {
    private static String name = "John";
    private static String adress = new String("Bucharest");
    private static String bookTitle = "The Lord of the Rings";
    private static String anotherBookTitle = new String("The Lord of the Rings");

    public static void main(String[] args) {
        name = "John";
        StringMain.name = "John";

        // -----------------

        name.toLowerCase();
        System.out.println(name);
        // incorect

        System.out.println(name.toLowerCase());
        // corect

        name = name.toLowerCase();
        System.out.println(name);
        // corect

        // -----------------
        System.out.println(bookTitle == bookTitle);
        // true

        System.out.println(bookTitle.equals(anotherBookTitle));
        // true

        System.out.println(bookTitle == anotherBookTitle);
        // false

        System.out.println(anotherBookTitle == anotherBookTitle);
        // true

    }

}
