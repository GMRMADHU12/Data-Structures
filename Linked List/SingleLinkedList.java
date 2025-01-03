import java.util.*; // Importing the util package

class Node { // Node class
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

/*Creation */
    public static void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node; // If the list is empty, set root and tail to the new node
            tail = node; // If the list is empty, set root and tail to the new node
        } else {
            tail.next = node; // Link the current tail to the new node
            tail = node;      // Update the tail to the new node
        }
    }

/*Search a node in linkedlist */
    public static boolean search(Node root,int key){
        Node temp=root;
        while(temp!=null){
            if(temp.data==key){ // If the data of the current node is equal to the key
                return true;
            }
            temp=temp.next; // Traverse to the next node
        }
        return false;
    }
    
/*Traverse*/
    public static void display(Node root) {
        Node temp = root;
        while (temp != null) { 
            System.out.print(temp.data + " "); // Print the data of the current node
            temp = temp.next;
        }
    }

/*Length */
    public static int length(Node root){
        Node temp=root;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;  // Length of the linked list using recursion 1+length(root.next);
    }

/*insert at different positions*/
public static void insertAtPosition(Node root,int data, int position){
    Node node = new Node(data);
    Node temp=root;
    if(position<0 || position>length(root)){
        System.out.println("Invalid position");
        return;
    }
    else if(position==0){
        node.next=root;
        root=node;
    }
    while(--position>0){
        temp=temp.next;
    }
    node.next=temp.next;
    temp.next=node;
}

/*Insert in sorted manner */
public static void insertInSorted(Node root,int data){
    Node node=new Node(data);
    Node temp=root;
    if(root==null){
        root=node;
        return ;
    }
    else if(root.data>=node.data){
        node.next=root;
        root=node;
        return ;
    }
    else{
        while(temp.next!=null && temp.next.data<node.data){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
}

/*Delete node at particular position */
public static void deleteAtPosition(Node root,int position){
    Node temp=root;
    if(position<0 || position>length(root)){
        System.out.println("Invalid position");
        return;
    }
    else if(position==0){
        root=root.next;
    }
    while(--position>0){
        temp=temp.next;
    }
    temp.next=temp.next.next;
}

/*Delete all occurences of a node in list */
public static void deleteAllOccurences(Node root,int key){
    Node temp=root;
    while(temp.next!=null){
        if(temp.next.data==key){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
    }
    if(root.data==key){
        root=root.next;
    }
}

/*Delete all duplicates values in list */
    public static void deleteDuplicates(Node root){
        Node temp=root;
        if(root==null){
            return;
        }
        while(temp!=null && temp.next!=null){
            if(temp.next.data==temp.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }


/*Reverse of LinkedList */
public static void reverse(Node root){
    Node prev = null,head=root;
    if(root==null){
        return ;
    }
    while(head!=null){
        Node temp=head.next;
        head.next=prev;
        prev=head;
        head=temp;
    }
    while(prev!=null){
        System.out.print(prev.data+" ");
        prev=prev.next;
    }
    System.out.println();
}

/*Middle Element of LinkedList */
public static void middleElement(Node root){
    Node slow=root,fast=root;
    if(root==null){
        System.out.println("Empty List");
        return;
    }
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    
    System.out.println("Middle Element is:"+slow.data);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            insert(a);
        }

        System.out.println("The linked list is:");
        display(root);
        System.out.println();
        System.out.println("Length of the linked list is:"+length(root));

        System.out.println("Enter the element to be searched:");
        int search = sc.nextInt();
        if(search(root,search))
            System.out.println("Element found");
        else
            System.out.println("Element not found");

        System.out.println("Enter the element to be inserted:");
        int insert = sc.nextInt();
        System.out.println("Enter the position:");
        int position = sc.nextInt();
        insertAtPosition(root,insert,position);
        display(root);
        
        System.out.println();
        System.out.println("Enter the position to be deleted:");
        int delete = sc.nextInt();
        deleteAtPosition(root,delete);
        display(root);
        System.out.println();
        System.out.println("Enter the element to be deleted:");
        int deleteElement = sc.nextInt();
        deleteAllOccurences(root,deleteElement);
        display(root);
        System.out.println();
        System.out.println("Reverse of the linked list is:");
        reverse(root);

        middleElement(root);
        
        deleteDuplicates(root);

        System.out.println("After deleting duplicates:");
        display(root);

        System.out.println("Enter the element to be inserted in sorted manner:");
        int insertSorted = sc.nextInt();
        insertInSorted(root,insertSorted);
        display(root);

    }
}
