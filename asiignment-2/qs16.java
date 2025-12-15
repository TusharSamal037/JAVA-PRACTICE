import java.util.Scanner;

public class qs16 {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        double x=sc.nextDouble();
         double y=sc.nextDouble();
         double z=sc.nextDouble();
         double e=Math.min(x,Math.min(y,z));
         double g=Math.max(x,Math.max(y,z));
         double f=(x+y+z)-(e+g);
         System.out.println("ascending order of your given numbers are="+e+" "+f+" "+g);
         sc.close();








    }}