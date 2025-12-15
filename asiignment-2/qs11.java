import java.util.Scanner;

public class qs11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double e=sc.nextDouble();
        double d=sc.nextDouble();
        if(e/d==0){
            System.out.println("they are perfectly divisible with each other");
        }
else{
    System.out.println("enter another number as they both are not divisible");
}
sc.close();








    }}