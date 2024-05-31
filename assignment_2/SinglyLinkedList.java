package assignment_2;
/**
 * This class represents a singly linked list.
 */
class SinglyLinkedList {
    Node head; 

    /**
     * This static inner class represents a node in the singly linked list.
     */
    static class Node {
         
        int data;
        
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Inserts a new node at a specific position in the list.
     * 
     * @param data the data to be stored in the new node
     * @param position the position where the new node should be inserted
     */
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * Deletes a node at a specific position in the list.
     * 
     * @param position the position of the node to be deleted
     */
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }

    /**
     * Deletes the node that occurs after a given node.
     * 
     * @param node the node after which the next node should be deleted
     */
    public void deleteAfterNode(Node node) {
        if (node == null || node.next == null) {
            System.out.println("No node exists after the given node");
            return;
        }
        node.next = node.next.next;
    }

     /**
     * Searches for a node with a specific value.
     *
     * @param data the value to search for
     * @return true if the node is found, false otherwise
     */
    public boolean searchNode(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * Displays the entire linked list.
     */
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

