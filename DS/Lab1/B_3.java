import java.util.*;
//right
public class B_3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. : ");
        int n = sc.nextInt();
        
        //int count=0;

        for(int i = 2; i <n/2; i++){
                if(n % 2 == 0){
                    System.out.println("no is not prime");
                    return;
                }
            }
            System.out.println("no is prime");

        //LOGIC 1
        // for(int i = 2; i < n; i++){
            
        //     if(n % 2 == 0){
                
        //         count++;
        //     }
        // }

        // if(count == 0){
            
        //     System.out.println("Enter No. Is Prime No.");
        // }
        // else{

        //     System.out.println("Enter No. Is Not Prime No.");
        // } 
    }   
}