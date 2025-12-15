import java.util.Scanner;

public class qs03 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        double sal=sc.nextDouble();
        double da=(sal*4/10);
        System.out.println("Your DA cut is="+da);
        double hra=(sal*1/5);
        System.out.println("Your HRA cut is="+hra);
        double gross=sal-(da+hra);
        System.out.println("Your gross salary is="+gross);
        sc.close();



    }}