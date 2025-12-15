import java.util.Scanner;

public class qs19 {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a four digit number");
        int d=sc.nextInt();
        if(d<=1000||d>=9999){
            System.out.println("number is invalid ");
        }
        else{
            int su=0;
            int last=d%10;
            int first=d/1000;
            int ex=last+first;
            su +=ex;
            

        
        System.out.println("sum of the first and last digit of the given number is="+su);




}







    }}