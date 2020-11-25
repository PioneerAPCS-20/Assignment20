# Assignment 20

For this assignment you will create a simple chatbot that will respond to what the human says.

For example: if the user says "I love my cats!" the chatbot will respond with "Tell me more about your pets."

## Specifications

### Part 1
Download the starter code, which includes `Main.java` and `Chatbot.java` and follow the directions given by the comments.

For `Main.java`:

* Create a Chatbot object.
* Print the greeting.
* Fix the `while` statement so that it isn't case sensitive.
* Print the chatbot's response (inside the loop).

For `Chatbot.java`:

* In `getGreeting()`, return a message to greet the user when they start the program.
* In `getResponse()`, fill in the if statement to check if the user's statement contains "no" and fill in the else if to check if the user's statement contains "cat" or "dog".
* In `getRandomResponse()`, generate a random generic statement (have at least four to choose from).

### Part 2

Single keywords are interesting, but better chatbots look for groups of words. Statements like “I like cats,” “I like math class,” and “I like Spain” all have the form “I like something.” The response could be “What do you like about something?” In this part we will respond to groupings of words.

Download `Chatbot2.java`, which has the directions for part 2. You will also notice that `getResponse()` has been altered and there is a new method called `findKeyword()`. The `findKeyword()` method is a little bit more sophisticated and solves some of the issues in the code from part 1.

* Add an `else if` to `getResponse()` to check for "I want" statements.
* Fill in the `transformIWantStatement()` method to respond to "I want" statements.

## Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

