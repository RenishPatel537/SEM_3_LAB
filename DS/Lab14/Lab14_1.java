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
    public void insert(int data){
        TreeNode temp = root;
        TreeNode new_node = new TreeNode(data);
        if(root==null){
            root = new_node;
            return;
        }

        while (true) {
            if(temp.llink==null){
                temp.llink = new_node;
                return;
            }
            else if (temp.rlink==null) {
                temp.rlink = new_node;
                return;
            }
            else if(temp.llink.llink==null || temp.llink.rlink==null){
                temp = temp.llink;
            }
            else if (temp.llink.llink==null || temp.llink.rlink==null) {
                temp = temp.rlink;
            }
        }
    }

    public void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.data + " ");
            // int left = (root.llink == null) ? 0 : root.llink.data;
            // int right = (root.rlink == null) ? 0 : root.rlink.data;
            // System.out.println("left : "+left);
            // System.out.println("right : "+right);
            preOrder(root.llink);
            preOrder(root.rlink);
        }
    }
}

public class Lab14_1{
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);
        t.insert(8);
        t.preOrder(t.root);
    }
}