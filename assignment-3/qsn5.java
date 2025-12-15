import java.util.Scanner;
public class qsn5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the triangle  ");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(  (s1+s2)>s3||(s2+s3)>s1||(s1+s3)>s2  ){
            if(s1==s2&&s2==s3){
                System.out.println("It is a equilateral triangle");
               } else if(s1==s2||s1==s3||s2==s3){
                
                    System.out.println("It is a isoceleses triangle");
                } else{
                    if(s1!=s2||s2!=s3||s3!=s1){
                        System.out.println("It is a scalene traingle");
                    }
                }
                
             } 
             else{
                System.out.println("They do not form a valid triangle ");
             }      
                
            
           

                

                

            
        




    }}