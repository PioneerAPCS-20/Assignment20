public class Chatbot
{
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting()
    {
        // return a greeting that will be given when the user starts the program
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement - the user statement (input)
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if ()  // if the statement contains "no"
        {
            response = "Why so negative?";
        }
        else if ()  // if the statement mentions "cat" or "dog"
        {
            response = "Tell me more about your pets.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        
        // return a random response (create four of your own)
        // e.g. "That's interesting.", "Tell me more.", etc.


        return response;
    }
}
