class InventoryNode{
    int stock;
    String catogary="";
    InventoryNode link;

    public InventoryNode(int stock,String catogary){
        this.stock = stock;
        this.link = null;
        this.catogary = catogary;
    }
}

class InventoryList{
    InventoryNode head = null;
    InventoryNode tail = null;

    public boolean isExist(String s){
        InventoryNode temp = head;

        while (temp!=null) {
            if(temp.catogary.equals(s)){
                return true;
            }
            temp = temp.link;
        }
        return false;
    }

    public void commondI(String s,int stock){
        if(isExist(s)){
            InventoryNode temp = head;
            while (!temp.catogary.equals(s)) {
                temp = temp.link;
            }
            temp.stock = temp.stock + stock;
        }
        else{
            InventoryNode new_node = new InventoryNode(stock,s);
            if(head==null){
                head = new_node;
                tail = new_node;
            }
            else{
                tail.link = new_node;
                tail = new_node;
            }

        }
    }

    public void commondM(int n,int m){
        InventoryNode first = null;
        InventoryNode sec = null;
        InventoryNode temp = head;
        int count = 1;

        while (temp!=null) {
            if(count==n){
                first = temp;
            }
            else if(count==m){
                sec = temp;
            }

            temp = temp.link;
        }

        first.stock = first.stock + sec.stock;

        if(first.catogary.charAt(1)<sec.catogary.charAt(1)){
            first.catogary = first.catogary.charAt(1) + sec.catogary.charAt(1) + sec.catogary.substring(2);
        }
        else{
            first.catogary = sec.catogary.charAt(1) + first.catogary.charAt(1) + sec.catogary.substring(2);
        }
    }

    public void commondS(String catogory){
        InventoryNode temp = head;
        if(isExist(catogory)){
            while (!temp.catogary.equals(catogory)) {
                temp = temp.link;
            }

            System.out.println(temp.stock);
        }
        else{
            System.out.println("not avilable catogary");
            return;
        }
    }

    public void commondP(){
        InventoryNode temp = head;
        
        while (temp!=null) {
            if(temp.catogary.length()==6){
                System.out.println(temp.catogary+" "+temp.stock);
            }
            temp = temp.link;
        }
    }
}

public class Lab12_8 {
    public static void main(String[] args) {
        
    }
}   
