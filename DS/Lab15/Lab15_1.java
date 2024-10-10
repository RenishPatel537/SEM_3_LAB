import java.util.Scanner;

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

    public void createTreeFormArray(int a[]){

    }

    public void preOrder(TreeNode temp){

        if(temp==null){
            return;
        }

        System.out.print(temp.data+" ");
        preOrder(temp.llink);
        preOrder(temp.rlink);
    }

    // public int findIndex(String a[]){
    //     int i;

    //     return i;
    // }

    public void createTreeFromPreAndPost(String pre,String post){

        String [] a = pre.split(",");
        String [] b = post.split(",");

        int [] arr = new int[a.length];

        arr[1] = Integer.parseInt(a[1]);

        for(int i=1;i<a.length-2;i++){
            
            int x = pre.indexOf(a[i]+"");
            int y = post.indexOf(a[i]+"");

            arr[i+1] = Integer.parseInt(a[x+1]);


        }

    }
}


public class Lab15_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter preorder string with comma seprated");
        String preorder = sc.nextLine();

        System.out.println("enter postorder string with comma seprated");
        String postorder = sc.nextLine();
    }
}