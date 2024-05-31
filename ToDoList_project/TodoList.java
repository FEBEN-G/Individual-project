package ToDoList_project;

import java.util.Scanner;

/**
 * The TodoList class represents a to-do list that manages tasks using a singly linked list.
 * It provides methods to add tasks, mark tasks as completed, and view the list of tasks.
 */
public class TodoList {
    private Node head;   // Represents the head of a linked list of tasks

    /**
     * Retrieves the head node of the linked list.
     *
     * @return the head node of the linked list
     */
    public Node getHead() {
        return head;
    }

    /**
     * Sets the head node of the linked list.
     *
     * @param head the new head node of the linked list
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * Adds a new task to the to-do list.
     *
     * @param task the task to be added
     */
    public void addToDo(Task task) {
        Node newNode = new Node(task); // Create a new node for the task
        if (head == null) {
            head = newNode;            // If the list is empty, set the new node as the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;   // Traverse the list to find the last node
            }
            current.next = newNode;      // Add the new node to the end of the list
        }
    }

    /**
     * Marks a task with the specified title as completed.
     *
     * @param title the title of the task to be marked as completed
     */
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();      // Mark the task as completed
                return;
            }
            current = current.next;
        }
        System.out.println("Task with title \"" + title + "\" not found.");
    }

    /**
     * Adds a new task to the to-do list based on user input.
     */
    public void addToDoTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task title:");
        String title = scanner.nextLine();
        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        addToDo(new Task(title, description));     // Add a new task to the list
    }

    /**
     * Marks a task as completed based on user input.
     */
    public void markToDoAsCompleted() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the task to mark as completed:");
        String title = scanner.nextLine();
        markToDoAsCompleted(title);   // Mark a task as completed based on user input
    }

    /**
     * Displays the list of tasks in the to-do list.
     */
    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            Task task = current.task;
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + (task.isCompleted() ? "Yes" : "No"));
            System.out.println();
            current = current.next;
        }
    }
    // - The linked list structure allows dynamic addition of tasks.
    // - Time complexity for adding a task is O(n) in the worst case (when traversing the list).
}


    
