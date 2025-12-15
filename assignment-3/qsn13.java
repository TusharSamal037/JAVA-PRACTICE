import java.util.Scanner;

public class qsn13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two points(X,Y) ");
            double num1=sc.nextDouble();
         double num2=sc.nextDouble();
           
             if(num1!=0&&num2==0){
                System.out.println("On X-Axis");
             }
             else if(num2!=0&&num1==0)
               {
                    System.out.println("On Y-Axis");
                }
                else if(num1>0&&num2>0){
                    System.out.println("On I quadrant");
                }
                else if(num1<0&&num2>0){
                    System.out.println("On II quadrant");
                }
                else if(num1<0&&num2<0){
                    System.out.println("On III quadrant");
                }
                else if(num1>0&&num2<0){
                    System.out.println("On IV quadrant");
                }
                else if(num1==0&&num2==0){
                    System.out.println("On origin");
                }
             
      







    }}