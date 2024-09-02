// nodde of tree

import java.util.LinkedList;
import java.util.Queue;

class TNode {
    int data;
    Treell ll = new Treell(); // all child adrees link list
    int level;
    String path;

    public TNode(int data) {
        this.data = data;

    }
}

// node of ink list of tree node 
class TNodeAdd {
    TNodeAdd link; // next address link
    TNode tn; // tree node address

    public TNodeAdd(TNode tn) {
        this.tn = tn;
        this.link = null;
    }
}

class Treell {
    TNodeAdd head = null, tail = null;

    public void addAddress(TNode tn) {
        TNodeAdd new_add = new TNodeAdd(tn);

        if (head == null) {
            head = tail = new_add;
            return;
        }

        tail.link = new_add;
        tail = new_add;
    }
}

class Treee {
    TNode root = null;
    int level = -1;
    public static boolean flag = false;

    // method for create root node and his child
    public void insertChild(int data) {
        TNode new_node = new TNode(data);
        if (root == null) {
            root = new_node;
            root.level = 0;
            new_node.path = "root";
            return;
        }
        root.ll.addAddress(new_node);
    }

    // method for add particular element to insert child
    public void addParticularEleChild(int data, int parentname) {
        TNode temp = null;
        temp = search(parentname);
        TNode new_node = new TNode(data);

        if (temp == null) {
            System.out.println("parent not exist");
            return;
        }

        temp.ll.addAddress(new_node);
    }

    // this method use for search particular node and use in add child of particular node
    public void search(int key, TNode temp, TNode[] a) {
        if (root == null) {
            System.out.println("tree is empty");
            return;
        }

        if (temp.data == key) {
            a[0] = temp;
            flag = true;
            return;
        }

        TNodeAdd temp2 = temp.ll.head;
        if (temp2 != null) {
            search(key, temp2.tn, a);
            while (temp2.link != null) {
                temp2 = temp2.link;
                search(key, temp2.tn, a);
            }
        }
    }

    public TNode search(int key) {
        TNode[] b = new TNode[1];
        // b[0] = a;
        search(key, this.root, b);
        return b[0];
    }

    // this method print preeorder of tree
    public void preorder(TNode root1) {
        if (this.root == null) {
            System.out.println("tree is empty");
        }
        if (root1 == null) {
            return;
        }
        System.out.print(root1.data + " ");
        TNodeAdd temp2 = root1.ll.head;
        while (temp2 != null) {
            preorder(temp2.tn);
            temp2 = temp2.link;
        }
    }

    // public void levelOrederTraverssal(){
    //     TNode temp = root;
    //     if(root==null){
    //         System.err.println("tree is empty");
    //         return;
    //     }
    //     Queue<TNode> q = new LinkedList();
    //     Queue<TNode> q1 = new LinkedList();
    // }

    // this is use for me
    public void display() {
        TNode temp = root;
        TNodeAdd temp2 = root.ll.head;

        System.out.print(root.data + " ");
        while (temp2 != null) {
            System.out.print(temp2.tn.data + " ");
            temp2 = temp2.link;
        }
    }
}

public class TreeDemo {
    public static void main(String[] args) {
        Treee t = new Treee();

        t.insertChild(1);
        t.insertChild(2);
        t.insertChild(3);
        t.insertChild(4);
        t.insertChild(5);
        t.addParticularEleChild(7, 4);
        t.addParticularEleChild(6, 4);
        t.addParticularEleChild(8, 5);
        t.addParticularEleChild(9, 5);
        t.addParticularEleChild(7, 3);
        t.addParticularEleChild(8, 2);
        t.addParticularEleChild(7, 5);

        t.addParticularEleChild(10, 7);
        t.addParticularEleChild(11, 9);
        t.addParticularEleChild(12, 8);
        t.addParticularEleChild(13, 7);
        t.addParticularEleChild(14, 9);
        t.addParticularEleChild(15, 6);
        

        t.preorder(t.root);
        System.out.println();
        t.display();
    }

}
