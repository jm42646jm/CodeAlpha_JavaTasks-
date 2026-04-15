import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Simple Chatbot (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Bot: Hello!");
            } 
            else if (input.equals("how are you")) {
                System.out.println("Bot: I am fine!");
            } 
            else if (input.equals("your name")) {
                System.out.println("Bot: I am a chatbot.");
            } 
            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            } 
            else {
                System.out.println("Bot: I don't understand.");
            }
        }

        sc.close();
    }
}