import java.util.Scanner;

// ENTER STRING FROM USER CHANGE UPPERCASE TO LOWER CAS AND VISE-VERSA 
public class Lab4_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your String");

        String s1 = sc.nextLine();

        String[] s = new String[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            s[i] = s1.charAt(i) + "";
        }

        System.out.println((int) s1.charAt(0));

        System.out.println("Before:" + s1);
        s1 = "";

        for (int i = 0; i < s.length; i++) {
            if (((int) s[i].charAt(0)) <= 122 && 97 <= ((int) s[i].charAt(0))) {
                s[i] = s[i].toUpperCase();
            } else {
                s[i] = s[i].toLowerCase();
            }
            s1 = s1 + s[i];
        }

        // for(int i=0;i<s.length;i++){
        // s1 = s1+s[i];
        // }

        System.out.println("After:" + s1);

        // char c1 = 'Z'+32; //Z=90 z=122 a=97 A=65

        // System.out.println();

        // 27th MI LINE ME PELA S[i].charAt(i) KARYU HATU ANE BADHA ELEMENT MA EKAJ STRING NO CHARCTER HATO ATLE ERROR AVTI HATI ATLE ME S[i].charAt(0) KARYU KARAN KE BADHA MA EK  J CHARCTER CHE.

    }
}