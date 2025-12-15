import java.util.Scanner;

public class qsn10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks ");
        int num1=sc.nextInt();
        String grade="";
        if(num1>100||num1<0){
            grade="invalid input";
        }else{
             int mc=num1/10;
       
        
        switch(mc){
            case 10:

            case 9:
           
                grade="O";
            
            break;
            case 8:
            
            grade="A";
            break;
            case 7:
            
                grade="B";
            
            break;
            case 6:
            
               grade="C";
            
            break;
            case 5:
            
                grade="D";
            
            break;
            case 4:
            
                grade="E";
            
            break;
            default :
           
                grade="F";
            
            break;

        } }
        if(grade.equals("invalid input")){
            System.out.println("enter a number between 0 and 100");

        }else{
            System.out.println("The grade of the student is="+grade);
        }





    }}