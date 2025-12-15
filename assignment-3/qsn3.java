import java.util.Scanner;

public class qsn3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers  ");
        int s=sc.nextInt();
        int w=sc.nextInt();
        int r=sc.nextInt();
        if(s>w&&w>r){
            System.out.println("decresing");
        }
        
            else if(s<w&&w<r){
                 System.out.println("incresing");
                
            }
           
        
        else{
            System.out.println("Neither incresing nor decresing");
            
        }
        
    }}