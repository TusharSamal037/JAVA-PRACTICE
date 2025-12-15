package dsa;
import java.util.Scanner;

public class onceappearednumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        int sum=0;
        for (int i = 0; i < n1; i++){

         a[i] = sc.nextInt();

        }
        
        for (int i = 0; i < n1; i++){
            int c=0;
            for (int j = 0; j < n1; j++){
                if(a[j]==a[i]){
                    c++;

                }

            }

      
        if(c==1){
            System.out.println("number apperaing once="+a[i]);
            break;
        }
        sc.close();
  }


    }}
    