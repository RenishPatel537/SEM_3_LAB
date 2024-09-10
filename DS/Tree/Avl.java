class TreeNode{
    int data;
    TreeNode llink;
    TreeNode rlink;
    int leval;

    public TreeNode(int data){
        this.data = data;
        llink = null;
        rlink = null;
        leval = 1;
    }
}

class AvlTree{

    TreeNode root = null;
    int maxleval = 0;

    public void insertNode(int data){
        TreeNode temp = root;
        if(root==null){
            TreeNode tn = new TreeNode(data);
            root = tn;
            maxleval = tn.leval;
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
                    tn.leval = temp.leval + 1;
                    maxleval = tn.leval;
                    flag = false;
                }
                temp = temp.rlink;
            }
            else if(temp.data>data){
                if(temp.llink==null){
                    TreeNode tn = new TreeNode(data);
                    temp.llink = tn;
                    tn.leval = temp.leval + 1;
                    maxleval = tn.leval;
                    flag = false;
                }
                temp = temp.llink;
            }
        }
        rotation(data);
    }

    public int getHeight(TreeNode tn){
        if(tn==null){
            return 0;
        }
        return (maxleval+1-tn.leval);
    }

    public int maxPath(TreeNode tn){
        if(tn==null){
            return 0;
        }
        int left = maxPath(tn.llink);
        int right = maxPath(tn.rlink);
        return Math.max(left,right)+1;
    }

    public TreeNode findCriticalNode(int data){
        TreeNode temp = root;
        TreeNode maxCNode = null; 
        String s = "";

        while (true) {
            if(temp.data==data || temp==null){
                //System.out.println("nahi");
                return maxCNode;
            }
            if(temp.data<data){
                if(Math.abs(maxPath(temp.llink)-maxPath(temp.rlink))==2){
                    maxCNode = temp;
                    s = (temp.llink.data<data)? "RR" : "";
                    s = (temp.llink.data>data)? "RL" : "";
                }
                temp = temp.rlink;
            }
            if(temp.data>data){
                if(Math.abs(maxPath(temp.llink)-maxPath(temp.rlink))==2){
                    maxCNode = temp;
                    s = (temp.llink.data<data)? "LR" : "";
                    s = (temp.llink.data>data)? "LL" : "";
                }
                temp = temp.llink;
            }
        }      // return maxCNode;
    }

    public void rotation(int data){
        TreeNode cnode = findCriticalNode(data);

        if(cnode.data<data){
            if(cnode.rlink.data<data){
                // call llratation
            }
            if(cnode.rlink.data>data){
                // call rlratation
            }
        }

        if(cnode.data>data){
            if(cnode.llink.data<data){
                // call lrrotaion
            }
            if(cnode.llink.data>data){
                // call rrratation
            }
        }
    }

    public void leftRotate(TreeNode tn){
        TreeNode x = tn.rlink;
        x.llink = tn;
        tn.rlink = x.rlink;
    }

    public void rightRotation(TreeNode tn){
        TreeNode x = tn.llink;
        x.rlink = tn;
        tn.llink = x.llink;
    }

    public void LRRotation(TreeNode tn){

    }

    // public TreeNode RLRotation(){

    // }


}

public class Avl {

    public static void main(String[] args) {
        
    }
}