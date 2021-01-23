/* String Operations*/

public class string{
    public static void main(String[] args) {
    
// create a string
    String greet = "Hello!";
    System.out.println("The string is: " + greet);

    String name = "World";
    System.out.println("Second String: " + name);

    String world = "World";
    System.out.println("Second String: " + name);

//checks the string length
    System.out.println("The length of the string: " + greet.length());

// join two strings
    System.out.println("Joined String: " + greet.concat(name));

    // join two strings
    System.out.println("Joined String: " + greet + name);

// compare first and second strings
    boolean result1 = greet.equals(name);
    System.out.println("Strings first and second are equal: " + result1);

    //compare second and third strings
    boolean result2 = name.equals(world);
    System.out.println("Strings first and third are equal: " + result2);

// returns the character at 4
    System.out.println("The character at 4: " + greet.charAt(4));

// create string using the new keyword
    String example = new String("Hello! World");

    // returns the substring World
    System.out.println("Using the subString(): " + example.substring(7));

    // converts the string to lowercase
    System.out.println("Using the toLowerCase(): " + example.toLowerCase());

    // converts the string to uppercase
    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

    // replaces the character '!' with 'o'
    System.out.println("Using the replace(): " + example.replace('!', 'o'));

}
}
