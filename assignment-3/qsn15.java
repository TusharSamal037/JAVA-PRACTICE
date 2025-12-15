import java.util.Scanner;

public class qsn15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice scissors(1),paper(2),rock(3)");
        int c=sc.nextInt();
        int r=(int)(Math.random()*3)+1;
        String s="";
        String g="";
                switch(c){
            case 1:
            if(r==1){
                System.out.println("computer choice=scissors and you choice=scissors its a tie");
            }
            else if(r==2){
                System.out.println("computer choice=paper and you choice=scissors its a melodius win");
            }
            else{
                System.out.println("computer choice=rock and you choice=scissors its a melancholic loss");
            }
            
            break;
            case 2:
            if(r==2){
                System.out.println("computer choice=paper and you choice=paper its a tie");
            }
            else if(r==1){
                System.out.println("computer choice=scissors and you choice=paper its a melanchloic loss");
            }
            else{
                System.out.println("computer choice=rock and you choice=paper its a melodius win");
            }
            
            break;
            case 3:
            if(r==3){
                System.out.println("computer choice=rock and you choice=rock its a tie");
            }
            else if(r==2){
                System.out.println("computer choice=paper and you choice=rock its a melancholic loss");
            }
            else{
                System.out.println("computer choice=scissors and you choice=rock its a melodius win");
            }
           
            break;
            default:
            System.out.println("Invalid input");


        }
 
     
              















    }}