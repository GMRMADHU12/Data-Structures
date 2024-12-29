import java.util.*;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    static Node root=null; // Head of the linked list
    static Node tail=null; // Tail of the linked list

    

    public static void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node; // If the list is empty, set root and tail to the new node
            tail = node;
        } else {
            tail.next = node; // Link the current tail to the new node
            tail = node;      // Update the tail to the new node
        }
    }

    public static void display(Node root) {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            insert(a);
        }

        System.out.println("The linked list is:");
        display(root);
    }
}
