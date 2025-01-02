import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class queueUsingLinkedList{
    static Node front=null;
    static Node rear=null;
    public static void enqueue(int a){
        Node node=new Node(a);
        if(front==null){
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
    }
    public static void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Element removed:"+front.data);
            front=front.next;
        }
    }
    public static void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            Node temp=front;
            System.out.println("The queue is:");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1: 
                        System.out.print("Enter the element to be inserted:");
                        int a=sc.nextInt();
                        enqueue(a);
                        break;
                case 2:
                        dequeue();
                        break;
                case 3:
                        display();
                        break;
                case 4:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Invalid choice");
                break;   
            }
        }
    }
}