package dsa;
import java.util.Scanner;

public class maxconsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        int c=0;
        int max=0;
        for (int i = 0; i < n1; i++){

         a[i] = sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            if(a[i]==1){
                c++;
                if(c>max){
                    max=c;
                }
               
            }
            else{
                c=0;
            }

        }
        System.out.println("Max consecutive="+max);


        }}