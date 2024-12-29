import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class largestElement{
    public static int secondLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max=arr[i];
            }
            else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int kthLargest(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        String suffix = (k % 100 >= 11 && k % 100 <= 13) ? "th" : (k % 10 == 1) ? "st" : (k % 10 == 2) ? "nd" : (k % 10 == 3) ? "rd" : "th";
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){    //Arrays.sort(arr); arr[arr.length - 1];
                max=arr[i];
            }
        }
        System.out.println("First Largest: "+max);
        System.out.println("Second Largest: "+secondLargest(arr));
        System.out.printf("%d%s Largest Element: %d",k,suffix,kthLargest(arr,k));

    }
}