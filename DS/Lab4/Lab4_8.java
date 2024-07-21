public class Lab4_8{

    public static int sum(int[] array) {

        int sum = 0; 
        
        for (int i = 0; i < array.length; i++) { 
            
            sum += array[i]; 
        }
        return sum;
    }

    public static int min(int[] array) {
        
        int min = array[0]; 
        
        for (int i = 0; i < array.length; i++) { 
            
            if (array[i] < min) {
                
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {

        int max = array[0];
        
        for (int i = 0; i < array.length; i++) { 
            
            if (array[i] > max) {
                
                max = array[i];
            }
        }
        return max; 
    }

    public static double avg(int[] array) {
        
        int sum = sum(array); 
        return (double) sum / array.length;
    }

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + sum(data));
        System.out.println("Min: " + min(data));
        System.out.println("Max: " + max(data));
        System.out.println("Avg: " + avg(data));
    }
}