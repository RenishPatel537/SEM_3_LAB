import java.util.Scanner;

public class Create {
    String name;
    Scanner sc = new Scanner(System.in);
    public Create(){
        System.out.println("enter name of obj");
        this.name = sc.nextLine();
    }
    public void createOBJ(){
        CircularLL cll = new CircularLL();   
    }
}
