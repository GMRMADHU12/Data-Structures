import java.util.*;

public class stackUsingArray {
    static int top=-1;
    static int stack[];
    static int capacity;
    public static void push(int a){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top]=a;
        }
    }
    public static void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Element removed:"+stack[top--]);
        }
    }
    public static void display(){
        for(int i=top;i>0;i--){
            System.out.println(stack[i]);
        }
    }
    public static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isFull(){
        if(top==capacity-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int top(){
        return stack[top];
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of stack:");
        capacity = sc.nextInt();
        stack = new int[capacity];
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. top");
            System.out.println("7. Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element to be inserted:");
                    int a = sc.nextInt();
                    push(a);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    if(isEmpty()){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if(isFull()){
                        System.out.println("Stack is full");
                    }
                    else{
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Top element is:"+top());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
