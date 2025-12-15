import java.util.Scanner;

public class qsn9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        double num1=sc.nextDouble();
         double num2=sc.nextDouble();
         System.out.println("Enter the operator '+','-','*','/' ");
         char operator=sc.next().charAt(0);
         double result=0;
         switch(operator){
            case '+':
            result=num1+num2;
            System.out.println("Result for your input is="+result);
            break;
            case '-':
            result=num1-num2;
            System.out.println("Result for your input is="+result);
            break;
            case '*':
            result=num1*num2;
            System.out.println("Result for your input is="+result);
            case '/':
            if(num2!=0){
                result=num1/num2;
                System.out.println("Result for your input is="+result);
            }
            else{
                System.out.println("invalid please try another number");
            }
            break;
            default:
            System.out.println("Invalid opertor entered please chose from the given operator");
         }








    }}