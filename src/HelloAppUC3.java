/**
 * HelloAppUC3
 *
 * UC3: Display "Hello" with Command-Line Argument or Default Message
 */

public class HelloAppUC3
{
    public static void main(String[] args)
    {
        String name = "World";

        if(args.length > 0)
        {
            name = args[0];
        }

        System.out.println("Hello " + name + "!");
    }
}