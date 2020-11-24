import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Create a Chatbot object

        // Print greeting
        
        // User input
        String statement = in.nextLine();

        // Keep talking until user says "Bye", but change it so that it isn't case sensitive.
        while (!statement.equals("Bye"))
        {
            // Print response from chatbot
            

            // Get inuput from the user again.
            statement = in.nextLine();
        }
    }
}
