import java.util.Scanner;

public class qs6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three points X1,X2 and Y1,Y2 and Z1,Z2");
         double X1=sc.nextDouble();
         double X2=sc.nextDouble();
         double Y1=sc.nextDouble();
         double Y2=sc.nextDouble();
         double Z1=sc.nextDouble();
         double Z2=sc.nextDouble();
         double s1=Math.sqrt(Math.pow(X2-X1, 2)+Math.pow(Y2-Y1, 2));
           double s2=Math.sqrt(Math.pow(Y2-Y1, 2)+Math.pow(Z2-Z1, 2));
             double s3=Math.sqrt(Math.pow(Z2-Z1, 2)+Math.pow(X2-X1, 2));
             double s=(s1+s2+s3)/2;
             double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
             System.out.println("Area of the triangle is="+area);
             sc.close();








    }}