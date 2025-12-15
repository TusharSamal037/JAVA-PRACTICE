package dsa;
import java.util.Scanner;
public class longestsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements:");
        
        int max=0;
        for (int i = 0; i < n1; i++){

         a[i] = sc.nextInt();
        }
        System.out.println("enetr the number whose subarray you wanna find");
        int c=sc.nextInt();
        int len=0;
        for(int i=0;i<n1;i++){
            int s=0;
            for(int j=i;j<n1;j++){
               
                    
                    s+=a[j];
                    if(s==c){
                        len=Math.max(len, (j-i)+1);

                    }

                }
            

            }

        
        System.out.println("length ="+len);







    }}