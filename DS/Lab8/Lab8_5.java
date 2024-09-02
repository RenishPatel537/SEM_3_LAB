import java.util.*;

public class Lab8_5 {
    public static void main(String[] args) {
        
        int [] a = {0,1,0,0,1};
        int [] b = {1,0,1,0,0};

        int n = unableEat(a, b);
        System.out.println(n);

    }

    public static int unableEat(int[]a,int[]b){
        Stack<Integer> s = new Stack<>();

        for(int i=b.length-1;i>=0;i--){
            s.push(b[i]);
        }

        Queue<Integer> q = new LinkedList();

        for(int i=0;i<a.length;i++){
            q.add(a[i]);
        }

        int count = 0;
        //int i = a.length;


        while (!(q.isEmpty()) &&count<q.size()) {
            if(q.peek()==s.peek()){
                q.poll();
                s.pop();
                count = 0;
            }
            else{
                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }
}
