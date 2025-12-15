import java.util.Scanner;

public class qsn11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks ");
        int num1=sc.nextInt();
        boolean w=num1%5==0&&num1%6==0;
            System.out.println("it is divisible by 5 and 6="+w);
            boolean e=num1%5==0||num1%6==0;
            System.out.println("it is divisible by 5 or 6="+e);
              boolean t=num1%5==0 ^ num1%6==0;
             System.out.println("it is divisible by 5 or 6 but not both="+e); 
        







    }}