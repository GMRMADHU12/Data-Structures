import java.util.*;
public class Main {
    public static void hcf(int n1,int n2){
        int hcf=(n1<n2)?n1:n2;
        for(int i=hcf;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println(hcf);
    }
    public static void lcm(int n1,int n2){
        int big=(n1>n2)?n1:n2;
        for(int i=big;i<=n1*n2;i=i+big){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        hcf(n1, n2);
        lcm(n1, n2);

    }
}
