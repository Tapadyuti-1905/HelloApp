/**
 * HelloAppUC5
 *
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message

 */


public class HelloAppUC5 {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for(String name : args) {
                if(!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            System.out.println("Hello, " + nameBuilder + "!");
        }
    }
}