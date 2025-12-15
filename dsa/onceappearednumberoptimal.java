package dsa;
import java.util.Scanner;

public class onceappearednumberoptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        int result=0;
        for (int i = 0; i < n1; i++){

         a[i] = sc.nextInt();

        }
        
        for (int i = 0; i < n1; i++){
            result=result^a[i];

        }
        System.out.println("once appeared number="+result);


    }}
