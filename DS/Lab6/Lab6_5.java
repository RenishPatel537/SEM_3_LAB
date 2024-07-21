import java.util.*;

class Bank_Account{
    long account_no;
    private int balance;
    String account_holder;
    String name;
    Scanner sc = new Scanner(System.in);

    void setDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter account  no");
        account_no = sc.nextLong();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter balance");
        balance = sc.nextInt();
        System.out.println("enter account holder");
         account_holder = sc.next();
    }


    void deposite_Money(){
        System.out.println("enter your money to deposite");
        int add = sc.nextInt();
        balance = balance + add;
    }

    void withdraw_maoney(int upad){
        if(balance-upad<0){
            System.out.println("not sufficient balance");
        }
        else{
            balance = balance - upad;
        }

    }

    void check_balance(){
        System.out.println("your balnce is"+balance);
    }
}
public class Lab6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Account [] ac = new Bank_Account[5];

        for(int i=0;i<ac.length;i++){
            ac[i] = new Bank_Account();
            ac[i].setDetail();   
        }

        System.out.println("what do you want");
        System.out.println("for withdraw:1 deposite:2 check balnce:3");

        int a = sc.nextInt();
        System.err.println("enter your bank account no");
        long b = sc.nextLong();

        if(a==1){
            ac[0].withdraw_maoney(2000);
        }
        else if(a==2){
            ac[0].deposite_Money();
        }
        else if(a==3){
            ac[0].check_balance();
        }
    }
}
