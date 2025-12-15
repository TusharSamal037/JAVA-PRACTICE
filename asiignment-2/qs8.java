import java.util.Scanner;

public class qs8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number of eggs");
        int n=sc.nextInt();
        int gross=n/144;
        int rem=n-(gross*144);
        int doz=rem/12;
        int remaining=rem-(doz*12);
        System.out.println("gross number of eggs="+gross);
        System.out.println("no. of dozens ="+doz);
        System.out.println("total eggs remaining="+remaining);
        sc.close();









    }}