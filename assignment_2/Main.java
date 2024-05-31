package assignment_2;

/**
 * Main class to test the operations on SinglyLinkedList and Stack.
 */
public class Main {
    public static void main(String[] args) {
        // Testing LinkedList operations
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new singly linked list

        // Insert elements at specific positions
        list.insertAtPos(5, 1); // Insert 5 at position 1
        list.insertAtPos(6, 2); // Insert 6 at position 2
        list.insertAtPos(7, 3); // Insert 7 at position 3
        list.insertAtPos(8, 2); // Insert 8 at position 2
        list.displayList(); // Display the list: 5 -> 8 -> 6 -> 7 -> null

        // Delete element at position 3
        list.deleteAtPosition(3); // Delete element at position 3
        list.displayList(); // Display the list: 5 -> 8 -> 7 -> null

        // Delete the node after the head node
        list.deleteAfterNode(list.head); // Delete node after the head node (5)
        list.displayList(); // Display the list: 5 -> 7 -> null

        // Search for elements in the list
        System.out.println("Search for 5: " + list.searchNode(5)); // Search for 5: true
        System.out.println("Search for 9: " + list.searchNode(9)); // Search for 9: false

        // Testing Stack operations
        Stack stack = new Stack(); // Create a new stack

        // Push elements onto the stack
        stack.push(100); // Push 100 onto the stack
        stack.push(500); // Push 500 onto the stack
        stack.push(1000); // Push 1000 onto the stack
        stack.displayStack(); // Display the stack: 1000 -> 500 -> 100 -> null

        // Pop element from the stack
        System.out.println("Pop: " + stack.pop()); // Pop the top element: 1000
        stack.displayStack(); // Display the stack: 500 -> 100 -> null

        // Peek at the top element of the stack
        System.out.println("Peek: " + stack.peek()); // Peek at the top element: 500
        stack.displayStack(); // Display the stack: 500 -> 100 -> null
    }
}
