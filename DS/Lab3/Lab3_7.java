import java.util.Scanner;

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many no. do you need in pascal triagle");
        int n = sc.nextInt();

        int [][] a = new int[n][];

        for(int i=0;i<a.length;i++){
            a[i] = new int[i+1];
        }   // DAREK ROW NE ELEMENT VADHTA JASE ATLE DAREK ROW NE ALAG ALAG ALEMENT NI CAPACITY AAPI CHE AA APNE MAIN FOR LOOP MAPN KARI SAKI JE NICHE COMMENT KARI NR LAKHYU CHE

        for(int i=0;i<n;i++){
            //a[i] = new int[i+1];
            int temp =1;
            for(int j=0;j<=i;j++){
                if(j==0){
                    a[i][j] = 1;       
                }
                else{
                    a[i][j] = ((temp)*(i-j+1))/(j);   // Nc(r+1) = ((n)*(r-1))/(r+1)
                                                      // r+1 = j thase and (r atle agla itration no j)
                }
                temp = a[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                
                
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
