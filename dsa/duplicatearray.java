package dsa;
import java.util.Scanner;

public class duplicatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int t[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

       
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                t[j++] = arr[i];
            }
        }

       
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(t[i] + " ");
        }
    }
}

