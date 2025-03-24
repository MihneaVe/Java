package ex_lab.ex_3;

public class StringUtilityMethodsMain {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name = "John";
        String adress = new String("Bucharest");
        String bookTitle = "The Lord of the Rings";
        String anotherBookTitle = new String("The Lord of the Rings");

        // -----------------
        
        // toUpperCase
        // Explanation: Returns a string in uppercase
        System.out.println(name.toUpperCase());

        // -----------------

        // toLowerCase
        // Explanation: Returns a string in lowercase
        System.out.println(name.toLowerCase());

        // -----------------

        // indexOf
        // Explanation: Returns the index of the first occurrence of the specified character
        System.out.println(name.indexOf('o'));

        // -----------------

        // lastIndexOf
        // Explanation: Returns the index of the last occurrence of the specified character
        System.out.println(name.lastIndexOf('o'));

        // -----------------

        // charAt
        // Explanation: Returns the character at the specified index
        System.out.println(name.charAt(2));

        // -----------------

        // compareTo
        // Explanation: Compares two strings lexicographically
        System.out.println(name.compareTo("John"));

        // -----------------

        // equals
        // Explanation: Compares two strings
        System.out.println(name.equals("John"));

        // -----------------

        // equalsIgnoreCase
        // Explanation: Compares two strings, ignoring case considerations
        System.out.println(name.equalsIgnoreCase("john"));

        // -----------------

        // trim
        // Explanation: Removes leading and trailing whitespaces
        System.out.println(name.trim());

        // -----------------

        // startsWith
        // Explanation: Checks if a string starts with a specified prefix
        System.out.println(name.startsWith("J"));

        // -----------------

        // endsWith
        // Explanation: Checks if a string ends with a specified suffix
        System.out.println(name.endsWith("n"));

        // -----------------

        // substring
        // Explanation: Returns a new string that is a substring of this string
        System.out.println(name.substring(1, 3));
    }
}
