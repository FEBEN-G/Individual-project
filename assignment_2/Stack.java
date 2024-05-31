package assignment_2;

/**
 * This class represents a stack implemented using a singly linked list.
 */
class Stack {
    private SinglyLinkedList.Node top; // Reference to the top of the stack

    /**
     * Pushes an element onto the stack.
     *
     * @param data the data to be pushed onto the stack
     */
    public void push(int data) {
        SinglyLinkedList.Node newNode = new SinglyLinkedList.Node(data); // Create a new node with the given data
        newNode.next = top; // Set the new node's next reference to the current top
        top = newNode; // Update the top to be the new node
    }

    /**
     * Pops an element from the stack.
     *
     * @return the data from the top element of the stack, or -1 if the stack is empty
     */
    public int pop() {
        if (top == null) { // Check if the stack is empty
            System.out.println("Stack is empty"); // Print message indicating the stack is empty
            return -1; 
        }
        int data = top.data; // Get the data from the top node
        top = top.next; // Update the top to the next node in the stack
        return data; 
    }

    /**
     * Peeks at the top element of the stack without removing it.
     *
     * @return the data from the top element of the stack, or -1 if the stack is empty
     */
    public int peek() {
        if (top == null) { // Check if the stack is empty
            System.out.println("Stack is empty"); 
            return -1; 
        }
        return top.data;
    }

    /**
     * Displays the entire stack.
     */
    public void displayStack() {
        SinglyLinkedList.Node temp = top; 
        while (temp != null) { // Traverse the stack until the end
            System.out.print(temp.data + " -> "); 
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); 
    }
}
