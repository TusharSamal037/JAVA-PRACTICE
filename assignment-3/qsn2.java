import java.util.Scanner;

public class qsn2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of steps walked ");
        int s=sc.nextInt();
        if(s>=10000){
            System.out.println("Good job! You are active today");
        }
        else{
            System.out.println("You need to walk more for good health");
        }
        
    }}