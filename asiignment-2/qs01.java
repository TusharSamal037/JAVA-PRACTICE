import java.util.Scanner;

public class qs01 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        double ces=sc.nextDouble();
        double far=(ces*9/5)+32;
        System.out.println("the temperature in faranheit="+far);
        sc.close();

    }
    
}
