public class Lab12_5 {
    public static void main(String[] args) {
        ListDemo12_1 sList = new ListDemo12_1();

        sList.addNode(18);    
        sList.addNode(6);    
        sList.addNode(10);    
        sList.addNode(3);

        sList.display();

        sList.insertGCD();

        sList.display();
    }
}
