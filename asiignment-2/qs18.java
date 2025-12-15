import java.util.Scanner;

public class qs18 {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        if(x < y*z&&y < x*z&&z < x*y){
            System.out.println("TRUE");
        }
else{
    System.out.println("FALSE");
}
sc.close();






    }}