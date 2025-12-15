import java.util.Scanner;
public class qsn4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int s=sc.nextInt();
        int w=(int)(Math.random()*8)+1;
        System.out.println("Computer guess="+w);
        if(s==w){
            System.out.println("You Got It Right");
        }
        else if(w==s+1||w==s-1){
            System.out.println("You Got It Almost Right");
        }
        else{
            System.out.println("You Are Wrong Try Another Time");
        }

            
        





    }}