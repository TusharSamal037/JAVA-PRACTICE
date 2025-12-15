import java.util.Scanner;
public class qsn6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(b*b)-(4*a*c);
        double r1=(-b+Math.sqrt(d))/(2*a);
        double r2=(-b-Math.sqrt(d))/(2*a);
        if(d>=0||d<=0){

       
        if(d>0){
            System.out.println("The equation has two roots="+r1+" "+r2);
           }  
           else if(d<0){
            System.out.println("The equation has one roots="+r1);
           }
           else{
            if(d==0);
           }
        

}
else{
    System.out.println("The equation has no real roots");
}

    }}