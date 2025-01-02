import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class stackUsingLinkedList {
    static Node top=null;
    public static void push(int a){
        Node node=new Node(a);
        if(top==null){
            top=node;
        }
        else{
            node.next=top;
            top=node;
        }
    }
    public static void pop(){
        if(top==null){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Element removed:"+top.data);
            top=top.next;
        }
    }
    public static void display(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp=top;
            System.out.println("The stack is:");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int a=sc.nextInt();
                    push(a);
                    break;
                case 2:
                    pop();
                    break;  
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                
            }    
        }
    }
}
