import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Note Application!");

        while (true) {
            System.out.println("\nWhat would you like to do? Enter '1' to create a new note or '2' to exit.");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nEnter your note:");
                String note = scanner.next();

                try {
                    // Write the note to a file named "notes.txt"
                    BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true));
                    writer.append(note + "\n");
                    writer.close();
                    System.out.println("Note saved successfully!");
                } catch (IOException e) {
                    System.out.println("Error writing note to file.");
                }

            } else if (choice == 2) {
                System.out.println("\nGoodbye!");
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
