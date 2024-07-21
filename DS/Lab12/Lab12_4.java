public class Lab12_4 {
    public static void main(String[] args) {
        ListDemo12_1 sList = new ListDemo12_1();

        sList.addNode(2);    
        sList.addNode(4);    
        sList.addNode(3);    
        sList.addNode(1);

        sList.display();

        sList.swapKthAtEndKth(2);

        sList.display();
    }
}
