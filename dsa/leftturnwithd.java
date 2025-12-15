package dsa;
import java.util.Scanner;

public class leftturnwithd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];int j=0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number for which the array will be shifted");
        int d=sc.nextInt();
        d=d%n;
        int[] temp=new int[d];
        for (int i = 0; i < d; i++){
            temp[i]=arr[i];
        }
        for (int i = d; i < n; i++){
            arr[i-d]=arr[i];
        }
        for (int i = n-d; i < n; i++){
                 arr[i]=temp[j++];
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }






    }}