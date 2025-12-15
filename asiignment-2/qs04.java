import java.util.Scanner;

public class qs04 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of theh hexagon");
        double side=sc.nextDouble();
        double area=(3*Math.sqrt(3)/2)*Math.pow(side, 2);
        System.out.println("Area of the Hexagon is="+area);
        sc.close();







    }}