package ToDoList_project;

/**
 * The Node class represents a node in a singly linked list used in the ToDoList application.
 * Each node contains a Task object representing a task and a reference to the next node in the list.
 */
public class Node {
    Task task;  // Represents a task associated with this node
    Node next;  // Points to the next node in the linked list

    /**
     * Constructs a new Node object with the given Task.
     *
     * @param task the task associated with this node
     */
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

	


