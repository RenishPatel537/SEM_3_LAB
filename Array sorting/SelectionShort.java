public class SelectionShort {
    public static void main(String[] args) {
        int []a = {7,8,3,1,2};

        for(int i=0;i<a.length-1;i++){
            int min = a[i];
            int minindex = i;
            for(int j=i+1;j<a.length;j++){
                if(min>a[j]){
                    min = a[j];
                    minindex = j;
                }
            }
            if(minindex!=i){
                a[minindex] = a[i];
                a[i] = min;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
