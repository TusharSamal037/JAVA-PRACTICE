package dsa;
import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        int sum=0;
        for (int i = 1; i < n1; i++){

         a[i] = sc.nextInt();
         sum+=a[i];
 

        }
        int n=n1*(n1+1)/2;
        System.out.println("missing number="+(n-sum));
         





    }}