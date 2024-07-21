public class C_4 {
 //right print armstrong no 1 to 1000
    public static void main(String[] args) {
        
        for(int i = 1; i <= 1000; i++){

            int number = i;
            int realnumber = i;
            int digits = 0, r = 0, result = 0;

            while(number != 0){

                digits++;
                number /= 10;
            }

            number = i;

            while(number != 0){

                r = number % 10;
                result += Math.pow(r , digits) ;
                number /= 10;
            }

            if( result == realnumber){

                System.out.println(result+" ");
            }
        }
    }
}

