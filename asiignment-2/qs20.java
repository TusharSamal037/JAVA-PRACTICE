import java.util.Scanner;

public class qs20{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        double a=(double)(Math.random()*1);
        double b=(double)(Math.random()*1);
        double c=(double)(Math.random()*1);
        double d=(double)(Math.random()*1);
        double e=(double)(Math.random()*1);
        System.out.println("number="+a);
          System.out.println("number="+b);
            System.out.println("number="+c);
              System.out.println("number="+d);
                System.out.println("number="+e);
                double avg= (a+b+c+d+e)/5;
                System.out.println("Average value of this random generated numbers is="+avg);
                double min=Math.min(a, Math.min(b,c));
                double min1=Math.min(min,Math.min(d,e));
                System.out.println("Minimun value in this random generated numbers is="+min1);
                double max=Math.min(a, Math.max(b,c));
                 double max1=Math.max(max,Math.max(d,e));
                 System.out.println("Maximum value in this random generated numbers is="+max1);
                 sc.close();













    }}