public class SinglyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head = null;

    // Insert at the front
    public void insertAtFront(int data) {
        Node newNode = new Node(data);  // create new node
        newNode.next = head;            // point new node to current head
        head = newNode;                 // move head to point to new node
    }

    // Display the list
    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtFront(30);
        list.insertAtFront(20);
        list.insertAtFront(10);

        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}

        

  
