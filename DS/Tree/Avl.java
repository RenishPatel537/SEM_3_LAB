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
                    // tn.leval = temp.leval + 1;
                    // maxleval = tn.leval;
                    // flag = false;
                    break;
                }
                temp = temp.rlink;
            }
            else if(temp.data>data){
                if(temp.llink==null){
                    TreeNode tn = new TreeNode(data);
                    temp.llink = tn;
                    // tn.leval = temp.leval + 1;
                    // maxleval = tn.leval;
                    // flag = false;
                    break;
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

        if(cnode==null){
            return;
        }

        if(cnode.data<data){
            if(cnode.rlink.data<data){
                leftRotate(cnode);
            }
            if(cnode.rlink.data>data){
                RLRotation(cnode);
            }
        }

        if(cnode.data>data){
            if(cnode.llink.data<data){
                LRRotation(cnode);
            }
            if(cnode.llink.data>data){
                rightRotation(cnode);
            }
        }
    }

    public void leftRotate(TreeNode tn){
        TreeNode x = tn.rlink;
        TreeNode temp = x.llink;
        x.llink = tn;
        tn.rlink = temp;

        TreeNode a = search(tn.data);

        if(a==null){
            root = x;
            return;
        }

        if(tn.data<a.data){
            a.llink = x;
        }
        else{
            a.rlink = x;
        }
    }

    public void rightRotation(TreeNode tn){
        TreeNode x = tn.llink;
        TreeNode temp = x.rlink;
        x.rlink = tn;

        tn.llink = temp;

        TreeNode a = search(tn.data);

        if(a==null){
            root = x;
            return;
        }

        if(tn.data<a.data){
            a.llink = x;
        }
        else{
            a.rlink = x;
        }
    }

    public void LRRotation(TreeNode tn){
        TreeNode x = tn.llink;
        TreeNode y = x.rlink;
        tn.llink = y;
        y.llink = x;

        TreeNode z = y.rlink;
        y.rlink = tn;
        tn.llink = z;

        TreeNode a = search(tn.data);

        if(a==null){
            root = y;
            return;
        }

        if(tn.data<a.data){
            a.llink = y;
        }
        else{
            a.rlink = y;
        }
    }

    public void RLRotation(TreeNode tn){
        TreeNode x = tn.rlink;
        TreeNode y = x.llink;
        x.llink = null;
        tn.rlink = y;
        y.rlink = x;

        TreeNode z = y.llink;
        y.llink = tn;
        tn.rlink = z;

        TreeNode a = search(tn.data);

        if(a==null){
            root = y;
            return;
        }

        if(tn.data<a.data){
            a.llink = y;
        }
        else{
            a.rlink = y;
        }
    }

    public TreeNode search(int data){
        TreeNode temp = root;

        while (temp.llink!=null) {
            if(temp.llink.data == data || temp.rlink.data==data){
                return temp;
            }
            else if(temp.data<data){
                temp = temp.rlink;
            }
            else if(temp.data>data){
                temp = temp.llink;
            }
        }
        return null;
    }

    public void preOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        preOrder(temp.llink);
        preOrder(temp.rlink);
    }

}

public class Avl {

    public static void main(String[] args) {
        AvlTree avl = new AvlTree();
        avl.insertNode(64);
        avl.insertNode(1);
        avl.insertNode(44);
        avl.insertNode(26);
        avl.insertNode(13);
        avl.insertNode(110);
        avl.insertNode(98);
        avl.insertNode(95);

        avl.preOrder(avl.root);
    }
}