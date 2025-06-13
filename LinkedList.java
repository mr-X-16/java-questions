import java.util.*;
public class SinglyLinkedList {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    Node head = null;

    // Insert at the front
    
    public void insertAtFront(int data) {
        Node newNode = new Node(data);  
        newNode.next = head;            
        head = newNode;                 
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

        list.display();  
    }
}

        

  
