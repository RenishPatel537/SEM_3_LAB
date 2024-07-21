import java.util.*;

public class C_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Day : ");
        int day = sc.nextInt();

        int n = day;

        int year , month , week;

        year = (day/365);

        month = ((day%365)/30);

        week = ((day - (year*365 + month*30))/7);

        day = ((day - (year*365 + month*30 + week*7)));

        System.out.println(n+" Days = "+year+"Year,"+month+"Month,"+week+"Week,"+day+"Day");

    }
}