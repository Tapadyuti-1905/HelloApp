/**
 * HelloAppUC2
 *
 * UC2: Display "Hello" with Command-Line Argument
 */

public class HelloAppUC2 
{
    public static void main(String[] args) 
    {
        String name = args[0];

        System.out.println("Hello " + name + "!");
    }
}