/*Linear Search->When we are dealing with a small dataset */
/*Binary Search */
import java.util.*;

public class search {
    public static int linearSearch(int a[],int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int a[],int k){
        int l = 0, r = a.length - 1;
        while(l<=r){
            int mid=l+(r-1)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(linearSearch(arr,k));
        System.out.println(binarySearch(arr,k));
    }
}
