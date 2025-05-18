


import java.util.Scanner;
  
  // to be sent to github.
  
public class OnlineSurvey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Survey introduction
        System.out.println("=== Welcome to the Online Survey ===");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Questions
        System.out.println("\nHi " + name + "! Please answer the following questions:");

        System.out.print("1. What is your favorite programming language? ");
        String language = scanner.nextLine();

        System.out.print("2. How many hours a day do you code? ");
        String hours = scanner.nextLine();

        System.out.print("3. Do you prefer working alone or in a team? ");
        String preference = scanner.nextLine();

        // Survey summary
        System.out.println("\n=== Survey Summary ===");
        System.out.println("Name: " + name);
        System.out.println("Favorite Language: " + language);
        System.out.println("Coding Hours per Day: " + hours);
        System.out.println("Work Preference: " + preference);

        System.out.println("\nThank you for taking the survey!");
    }
}