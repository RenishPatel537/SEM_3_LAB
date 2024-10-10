import java.util.*;
class TreeNode{
    int data;
    TreeNode llink;
    TreeNode rlink;

    public TreeNode(int data){
        this.data = data;
        llink = null;
        rlink = null;
    }
}

class BinarySearchTree{
    TreeNode root = null;

    public void insertTreeNode(int data,TreeNode temp){
        if(root==null){
            TreeNode tn = new TreeNode(data);
            root = tn;
            return;
        }
        else if(data == temp.data){
            System.out.println("already exist");
            return;
        }
        boolean flag = true;

        while (flag!=false) {
            if(data == temp.data){
                System.out.println("already exist");
                return;
            }
            else if(temp.data<data){
                // temp = temp.rlink;
                if(temp.rlink==null){
                    TreeNode tn = new TreeNode(data);
                    temp.rlink = tn;
                    flag = false;
                }
                temp = temp.rlink;
            }
            else if(temp.data>data){
                if(temp.llink==null){
                    TreeNode tn = new TreeNode(data);
                    temp.llink = tn;
                    flag = false;
                }
                temp = temp.llink;
            }
        }
    }

    public TreeNode search(int x,TreeNode temp){
        if(temp==null || temp.data==x){
            return temp;
        }
        else if (temp.data<x) {
            return search(x, temp.rlink);
        }
        else{
            return search(x, temp.llink);
        }
    }

    public void delete(int data){
        TreeNode temp = root;
        TreeNode tn;

        while (true) {
            if(temp.llink.data==data){
                tn = temp.llink;
                if(tn.llink==null && tn.rlink==null){
                    temp.llink = null;
                    return;
                }
                else if(tn.llink!=null && tn.rlink==null){
                    temp.llink = tn.llink;
                    return;
                }
                else if (tn.llink==null && tn.rlink!=null) {
                    temp.llink = tn.rlink;
                    return;
                }
                else {
                    temp.llink = tn.rlink;
                    TreeNode t = tn.rlink;
                    while (t.llink!=null) {
                        t = t.llink;
                    }
                    t.llink = tn.llink;
                    return;
                }
            }
            else if (temp.rlink.data==data) {
                tn = temp.rlink;

                if(tn.llink==null && tn.rlink==null){
                    temp.rlink = null;
                    return;
                }
                else if(tn.llink!=null && tn.rlink==null){
                    temp.rlink = tn.llink;
                    return;
                }
                else if (tn.llink==null && tn.rlink!=null) {
                    temp.rlink = tn.rlink;
                    return;
                }
                else {
                    temp.rlink = tn.rlink;
                    TreeNode t = tn.rlink;
                    while (t.llink!=null) {
                        t = t.llink;
                    }
                    t.llink = tn.llink;
                    return;
                }
            }
            else if (data>temp.data) {
                temp = temp.rlink;
            }
            else if (data<temp.data) {
                temp = temp.llink;
            }
        }
    }

    public void preOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        preOrder(temp.llink);
        preOrder(temp.rlink);
    }

    public void levelOrederTraverssal(){
        TreeNode temp = root;
        //boolean flag = true;
        if(root==null){
            System.err.println("tree is empty");
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        String s = "q";
        q.add(temp);
        while (!q.isEmpty() || !q1.isEmpty()) {
            if(s.equals("q") && !q.isEmpty()){
                if(q.peek().llink!=null){
                    q1.add(q.peek().llink);
                }
                if(q.peek().rlink!=null){
                    q1.add(q.peek().rlink);
                }
                System.out.print(q.poll().data+" ");
            }
            else if(s.equals("q")){
                s = "q1";
                System.out.println();
            }
            if(s.equals("q1") && !q1.isEmpty()){
                if(q1.peek().llink!=null){
                    q.add(q1.peek().llink);
                }
                if(q1.peek().rlink!=null){
                    q.add(q1.peek().rlink);
                }
                System.out.print(q1.poll().data+" ");
            }
            else if(s.contains("q1")){
                s = "q";
                System.out.println();
            }
        }
    }
}

public class Bst {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertTreeNode(10, bst.root);
        bst.insertTreeNode(5, bst.root);
        bst.insertTreeNode(15, bst.root);
        bst.insertTreeNode(13, bst.root);
        bst.insertTreeNode(16, bst.root);
        bst.insertTreeNode(3, bst.root);
        bst.insertTreeNode(6, bst.root);

        bst.delete(15);

        bst.preOrder(bst.root);
        System.out.println();
        TreeNode tn = bst.search(3, bst.root);
        System.out.println(tn.data);

        bst.levelOrederTraverssal();
    }
}
