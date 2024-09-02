class TreeNode{
    int data;
    TreeNode llink;
    TreeNode rlink;
    int height;

    public TreeNode(int data){
        this.data = data;
        llink = null;
        rlink = null;
        height = 1;
    }
}

class AvlTree{
    public int getHeight(TreeNode tn){
        if(tn==null){
            return 0;
        }
        return tn.height;
    }

    public int getBF(TreeNode tn){
        if(tn==null){
            return 0;
        }
        return getHeight(tn.llink) - getBF(tn.rlink);
    }

    public TreeNode leftRotate(TreeNode tn){
        TreeNode x = tn.llink;
        
    }
}

public class Avl {

    public static void main(String[] args) {
        
    }
}