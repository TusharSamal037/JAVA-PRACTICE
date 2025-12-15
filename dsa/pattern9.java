package dsa;
import java.util.Scanner;

public class pattern9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and column");
        int n1=sc.nextInt();
        
         for(int i=1; i<=n1; i++) {
           //spaces
           for(int j=1; j<=n1-i; j++) {
               System.out.print(" ");
           }


           //stars
           for(int j=1; j<=n1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}
