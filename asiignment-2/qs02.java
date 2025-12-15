import java.util.Scanner;

public class qs02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and length of the cylinder");
        double length=sc.nextDouble();
        double radius=sc.nextDouble();
        double area=Math.PI*radius*length;
        double volume=area*length;
        System.out.println("Area of the cylinder= "+area);
        System.out.println("Volume of the cylinder="+volume);
        sc.close();
    }}