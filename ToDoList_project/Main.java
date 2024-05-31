package ToDoList_project;

import java.util.Scanner;

/**
 * The Main class serves as the entry point for the To-Do List application.
 * It provides a simple console-based interface for users to manage their to-do tasks.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of TodoList to manage tasks
        TodoList toDoList = new TodoList();
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input

        // Infinite loop to continuously show the menu until the user decides to exit
        while (true) {
            // Display the menu options
            System.out.println("Choose an option:\n1. Add a new task\n2. Mark a task as completed\n3. View your to-do list\n4. Exit");
            int choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // Consume newline character left after nextInt()

            // Perform actions based on the user's choice
            switch (choice) {
                case 1:
                    // Add a new task
                    toDoList.addToDoTask();
                    break;
                case 2:
                    // Mark an existing task as completed
                    toDoList.markToDoAsCompleted();
                    break;
                case 3:
                    // View all tasks in the to-do list
                    toDoList.viewToDoList();
                    break;
                case 4:
                    // Exit the application
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner to release resources
                    return; // Terminate the main method, thus exiting the program
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

