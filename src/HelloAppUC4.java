/**
 * HelloAppUC4
 *
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 */


public class HelloAppUC4
{
    public static void main(String[] args)
    {
        String name = "World";

        if(args.length > 0)
        {
            StringBuilder nameBuilder = new StringBuilder();

            for(int i = 0; i < args.length; i++)
            {
                nameBuilder.append(args[i]);

                if(i < args.length - 1)
                {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello " + name + "!");
    }
}