// import java.util.Scanner;

// import javax.sound.sampled.*;

// public class Audio {
//     public static void main(String[] args) {
//         try {
//             // Open an audio input stream
//             AudioInputStream audioIn = AudioSystem.getAudioInputStream(Audio.class.getResource("Game Of Thrones music.wav"));
            
//             // Get a clip resource
//             Clip clip = AudioSystem.getClip();
            
//             // Open audio clip and load samples from the audio input stream
//             clip.open(audioIn);
            
//             Scanner sc = new Scanner(System.in);
//             System.out.println("enter n for paly 1 2 to puse 3 to exit");
//             int n = sc.nextInt();
//             while (n!=3) {
//                 System.out.println("n:");
//                 n = sc.nextInt();
//                 if(n==1){
//                     clip.start();
//                 }
//                 else if(n==2){
//                     clip.stop();
//                 }
//             }

//             clip.close();
//             // Start playing the audio clip
            
            
//             // Sleep while audio is playing
//             //Thread.sleep(clip.getMicrosecondLength() / 1000);
            
//             // Close the clip
            
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

import javax.sound.sampled.*;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) {
        try {
            // Open an audio input stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(Audio.class.getResource("Game Of Thrones music.wav"));

            // Get a clip resource
            Clip clip = AudioSystem.getClip();

            // Open audio clip and load samples from the audio input stream
            clip.open(audioIn);

            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);
            String command = "";

            System.out.println("Enter 'play' to start the music, 'stop' to stop the music, and 'exit' to quit.");

            //clip.start();
            while (!command.equals("exit")) {
                System.out.print("Command: ");
                command = scanner.nextLine();

                if (command.equals("play")) {
                    clip.start();
                } else if (command.equals("stop")) {
                    clip.stop();
                } else if (!command.equals("exit")) {
                    System.out.println("Unknown command. Please enter 'play', 'stop', or 'exit'.");
                }
            }

            // Close the clip and scanner
            clip.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
