import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode llink;
    TreeNode rlink;

    public TreeNode(int data){
        this.data = data;
        this.llink = null;
        this.rlink = null;
    }
}

class Tree{
    TreeNode root = null;
    
    public void createTreeFromArray(int [] a,int index){
       TreeNode temp = root;

       if(root==null){
        temp=root = new TreeNode(a[index]);
       }

       Queue<TreeNode> q = new LinkedList<TreeNode>();
       q.add(temp);

       int i = 0;

       while (i<a.length-1) {
        temp = q.poll();

        temp.llink = new TreeNode(a[i++]);
        temp.rlink = new TreeNode(a[i++]);
        q.add(temp.llink);
        q.add(temp.rlink);
       }
    }


    public void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.data + " ");
            // int left = (root.llink == null) ? 0 : root.llink.data;
            // int right = (root.rlink == null) ? 0 : root.rlink.data;
            // System.out.println("left : "+left);
            // System.out.println("right : "+right);
            if(root.llink != null){
                preOrder(root.llink);
            }
            else if(root.rlink != null){
                preOrder(root.rlink);
            }
        }
    }
}

public class Lab14_1{
    public static void main(String[] args) {
        Tree t = new Tree();
        int [] a = {1,2,3,4,5,6,7,8};
        t.createTreeFromArray(a, 0);
        t.preOrder(t.root);
    }
}