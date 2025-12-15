package dsa;
import java.util.Scanner;

public class largestarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        int la = Integer.MIN_VALUE;
        int sela = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (a[i] > la) {
                sela = la;
                la = a[i];
            } else if (a[i] > sela && a[i] != la) {
                
                sela = a[i];
            }
        }

        System.out.println("2nd largest = " + sela);
    }
}
