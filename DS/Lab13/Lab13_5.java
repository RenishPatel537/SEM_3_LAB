import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;

public class Lab13_5 {
    public static void main(String[] args) throws Exception {

        // FileInputStream fi = new FileInputStream("Game Of Thrones music.mpeg");

        String filepath = "Game Of Thrones music.wav";

        Song s = new Song();
        //s.AddSong("music.mp3");
        s.AddSong("mocking.wav");
        s.AddSong(filepath);
        s.AddSong(filepath);
        s.AddSong("interstellar.wav");

        //s.playMusic(filepath);
        //System.out.println(s.clip);

        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("Enter 'play' to start the music, 'stop' to stop the music, and 'exit' to quit.");


        while (!command.equals("exit")) {
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equals("play")) {
                s.playMusic();
            } else if (command.equals("stop")) {
                s.pauseMusic();
            }
            else if(command.equals("next")){
                s.playNextSong();
            }
            else if (command.equals("previous")) {
                s.playPriviousSong();
            }
             else if (!command.equals("exit")) {
                System.out.println("Unknown command. Please enter 'play', 'stop', or 'exit'.");
            }
        }

    }
}

class Song {
    //String filepath;
    SongNode head = null;
    SongNode tail = null;
    SongNode temp = head;

        public  void AddSong(String filepath) throws Exception{
            SongNode sn = new SongNode(filepath);
            if(head==null){
                head = sn;
                tail = sn;
                temp = sn;
                tail.lptr = sn;
                tail.rptr = sn;
            }// clip.open(audio);
            else{
                sn.lptr = tail;
                tail.rptr = sn;
                tail = sn;
                head.lptr = sn;
                sn.rptr = head;
            }
        }

    //Scanner sc = new Scanner(System.in);
    public  void playMusic() throws Exception {
        
        if (temp.musicpath.exists()) { 
            //int n = 0;
            //while (n != 2) {
                //n = sc.nextInt();
                //System.out.println(clip);
                if(!temp.clip.isOpen()){
                temp.clip.open(temp.audio);
                }
                temp.clip.start();
            //}
            //clip.close();
        } else
            System.out.println("file not found");
    }

    public void pauseMusic() throws Exception{
        //clip.open(audio);
        if(temp.clip.isRunning()){
            temp.clip.stop();
            //clip.close();
        }
        else{
            System.out.println("git bandh j che");
        }
    }

    public void playNextSong() throws Exception{
        //temp.clip.close();
        pauseMusic();
        temp = temp.rptr;
        playMusic();
    }

    public void playPriviousSong() throws Exception{
        // temp.clip.close();
        pauseMusic();
        temp = temp.lptr;
        playMusic();
    }
}

class SongNode{
    String filepath;
    File musicpath;
    Clip clip;
    AudioInputStream audio;
    SongNode lptr;
    SongNode rptr;

    public SongNode(String filepath) throws Exception{
        this.filepath = filepath;
        musicpath = new File(filepath);
        audio = AudioSystem.getAudioInputStream(musicpath);
        clip = AudioSystem.getClip();
        this.lptr = null;
        this.rptr = null;
    }
}
