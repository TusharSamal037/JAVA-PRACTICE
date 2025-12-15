package dsa;
import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++){

 a[i] = sc.nextInt();

        }
        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
b[i] = sc.nextInt();
        }
        int intersectionarr[] = new int[n1 + n2]; 
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                i++;
               
                }
                
            
            else if (a[i] > b[j]) {
               j++;
                }
                
            else {
                if (a[i]==b[j]) {
                    intersectionarr[k++]=a[i];
                   i++;
                   j++;
                }
                
            }
        }

        System.out.println("Intersection of arrays:");
        for (int x = 0; x < k; x++) {
            System.out.print(intersectionarr[x] + " ");
        }
    }
}
