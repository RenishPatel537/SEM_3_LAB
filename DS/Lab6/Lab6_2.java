import java.util.Scanner;

class Employee_Detail{
    int employeeid;
    String name;
    String designation;
    int salary;

    void setDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter employe id");
        employeeid = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter designation");
        designation = sc.next();
        System.out.println("enter salary");
        salary = sc.nextInt();
    }

    void getDetail(){
        System.out.println("employe id of"+name+":"+employeeid);
        System.out.println(name);
        System.out.println("designation of:"+name+":"+designation);
        System.out.println("salary of: "+name+":"+salary);
    }

}

public class Lab6_2 {
    public static void main(String[] args) {
        
        Employee_Detail e1 = new Employee_Detail();

        e1.setDetail();
        e1.getDetail();

    }   
}
