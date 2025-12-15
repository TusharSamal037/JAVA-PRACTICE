import java.util.Scanner;
public class qsn7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year  ");
        int y=sc.nextInt();
        if(y>999&&y<9999&&y>0){
            String res=((y%400==0)||((y%4==0)&&(y%100!=0))) ?  (y + " is a leap year.") : (y + " is not a leap year.");
            System.out.println(res);
            
        }
        else{
            System.out.println("enter a valid year to check");
        }






    }}
