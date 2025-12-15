package dsa;
import java.util.Scanner;

public class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and column");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=1;i<=n1;i++){
            for(int j= 1;j<=n2;j++){
                System.out.print("*");
            }
            System.err.println("");

        }

    }

}
