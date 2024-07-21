import java.util.*;

public class A_3{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Charcter : ");
        char c = sc.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U'){
             
            System.out.println("Enter charcter is vowel");
        }
        else{

            System.out.println("Enter charcter is consonant");
        }
    }
}