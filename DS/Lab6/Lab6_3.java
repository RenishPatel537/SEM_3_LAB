import java.util.*;
class Student_Dtail{
    long enroolment_no;
    String name;
    int semester;
    float cpi;
    void setDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter enrolment no");
        enroolment_no = sc.nextLong();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter semester");
        semester = sc.nextInt();
        System.out.println("enter cpi");
         cpi = sc.nextFloat();
    }

    void getDetail(){
        System.out.println(name);
        System.out.println("enrollment  no of"+name+":"+enroolment_no);
        System.out.println(name);
        System.out.println("semester of:"+name+":"+semester);
        System.out.println("cpi of: "+name+":"+cpi);
    }
}
public class Lab6_3 {
    public static void main(String[] args) {
        
        Student_Dtail [] a = new Student_Dtail[5];

        for(int i=0;i<a.length;i++){
            a[i] = new Student_Dtail();
            a[i].setDetail();
            
        }

        for(int i=0;i<a.length;i++){
            a[i].getDetail();
            System.out.println();
            System.out.println();
        }
    }
}
