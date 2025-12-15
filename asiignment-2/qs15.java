import java.util.Scanner;

public class qs15 {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        double x=sc.nextDouble();
         double y=sc.nextDouble();
         double z=sc.nextDouble();
        if(x<y&&y<z||x>y&&y>z){
            System.out.println("the numbers you entered are in ordered");
        }
else{
    System.out.println("the numbers are not in ordered please try again");
}
     sc.close();
    }}
