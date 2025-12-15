import java.util.Scanner;

public class qs10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance between your cities in km");
        int d=sc.nextInt();
        int m=d*1000;
        System.out.println("the distance between your cities in meter="+m+"meter");
        double f=d*3280.8399 ;
        System.out.println("the distance between your cities in feet="+f+"feet");
        double i=d* 39370.0787 ;
        System.out.println("the distance between your cities in inches="+i+"inches");
        double cm=d*100000;
        System.out.println("the distance between your cities in centimeter="+cm+"centimeters");
        sc.close();










    }}