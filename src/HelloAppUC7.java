/**
 * HelloAppUC7
 *
 * UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method or Default Message


 */

public class HelloAppUC7 {
    public static void main(String[] args) {

        String names = "World";

        if(args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}