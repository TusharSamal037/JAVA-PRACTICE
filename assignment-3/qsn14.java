import java.util.Scanner;

public class qsn14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=(int)(Math.random()*12)+1;
        String s="";
        switch(m){
            case 1:
            s="january";
            break;
            case 2:
            s="february";
            break;
            case 3:
            s="March";
            break;
            case 4:
            s="April";
            break;
            case 5:
            s="may";
            break;
            case 6:
            s="june";
            break;
            case 7:
            s="july";
            break;
            case 8:
            s="august";
            break;
            case 9:
            s="september";
            break;

            case 10:
            s="October";
            break;
            case 11:
            s="November";
            break;
            case 12:
            s="december";
            break;
            default:
            s="Invalid month";
            break;
            
            
            


        }
        System.out.println("Random generated number="+m);
        System.out.println("Month name="+s);



                






    }}