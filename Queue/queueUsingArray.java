import java.util.*;
public class queueUsingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();    
        int[] queue = new int[capacity];
        int front = 0;
        int rear = 0;
        int size = 0;
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.print("Enter the element to be inserted:");
                int a = sc.nextInt();
                if(size==capacity){ 
                    System.out.println("Queue is full");
                }
                else{
                    queue[rear++]=a;
                    size++;
                }
                break;
                case 2:
                if(size==0){
                    System.out.println("Queue is empty");
                }
                else{
                    System.out.println("Element removed:"+queue[front]);
                    front++;
                    size--;
                }
                break;
                case 3:
                if(size==0){
                    System.out.println("Queue is empty");
                }
                else{
                    System.out.println("The queue is:");
                    for(int i=0;i<size;i++){
                        System.out.print(queue[i]+" ");
                    }
                    System.out.println();
                }
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