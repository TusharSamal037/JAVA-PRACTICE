import java.util.Scanner;

public class qs9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 0 to 1000");
        int n=sc.nextInt();
        if(n<0||n>1000){
        System.out.println("Invalid input please enter a number between 0 and 1000");}
         else {
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum +=digit;
            temp/=10;
        }
System.out.println("The sum of the digits in the number="+sum);
    }
    sc.close();







    }}