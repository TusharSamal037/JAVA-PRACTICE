package dsa;
import java.util.Scanner;

public class pattern5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and column");
        int n1=sc.nextInt();
        
        for(int i=1;i<=n1;i++){
            
            for(int j= 1;j<=n1-i;j++){
                
                System.out.print(" ");
              }
              for(int j=1;j<=i;j++){
                System.out.print("*");
            
              }
             System.out.println(""); 
}

       } }

    