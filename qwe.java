import java.util.Scanner;

public class qwe {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two points(X,Y) ");
            int n=sc.nextInt();
            int r=0;
            int y=1;
           
            while(n > 0){
                int d=n%10;
                
                if(d!=0){
                    r=d*y+r;
                    y*=10;
                    
                    

                }
                n=n/10;
                

            }

System.out.println(r);

    }}