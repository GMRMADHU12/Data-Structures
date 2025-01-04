import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class binaryTree {
    static Node root;
    static Node node;
    public static Node create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data(enter -1 to exit):");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        node=new Node(data);
        System.out.println("Enter left for "+data);
        node.left=create();
        System.out.println("Enter right for "+data);
        node.right=create();
        return node;
    }
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "-->");
        if (root.left != null) {
            System.out.print("L->" + root.left.data + " ");
        } else {
            System.out.print("L->null ");
        }
        if (root.right != null) {
            System.out.print("R->" + root.right.data + " ");
        } else {
            System.out.print("R->null ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        root=create();
        display(root);
    }
}
