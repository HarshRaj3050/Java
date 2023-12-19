package College_Practical;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

class MusicPlayer {
    String[] songName = new String[10];
    int[] songLength = new int[10];
    String[] genre = new String[10];
    String[] lyrics = new String[10];
}
class MusicFunction extends MusicPlayer {
    public void list() {
        for (int i = 0; i < songName.length; i++) {
            if(songName[i] != null) {
                System.out.println("    " + (i + 1) + ". " + songName[i]);
            }
            else {
                break;
            }
        }
    }
    public void addSong(String songN, int songL, String genre) {
        for (int i = 0; i < songName.length; i++) {
            if (songName[i] == null) {
                songName[i] = songN;
                songLength[i] = songL;
                this.genre[i] = genre;
                break;
            }
        }
        System.out.println("!! Song is Add Successful !!\n");
    }
}
class PlaySong extends MusicFunction {
    String currentSong;
    String nextSong;
    String previousSong;
    int volume = 5;
    public void shuffle(int shuffle) {
        if(shuffle == 1) {
            System.out.println("|| Repeat ||");
        }
        else if(shuffle == 2) {
            System.out.println("|| Shuffle all song ||");
        }
    }
    public void pause() {
        System.out.println("|| Pause the Song ||");
    }
    public void nextSong() {
        for (String s : songName) {
            if (Objects.equals(currentSong, s)) {
                currentSong = s;
                System.out.println("--------------------\n<" + currentSong + "> Song is Play\n--------------------");

            } else {
                break;
            }
        }
    }
    public void volumeUP() {
        this.volume++;
        System.out.println("|| Volume : " + volume + " ||");
    }
    public void volumeDown() {
        this.volume--;
        System.out.println("|| Volume : " + volume + " ||");
    }
    public void download() {
        System.out.println("|| " + currentSong + " song is Download ||");
    }
}
public class Practical_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicFunction musicfunction = new MusicFunction();
        PlaySong playsong = new PlaySong();

        System.out.println("---------------------\n\tMUSIC PLAYER\n---------------------");
        System.out.println("1. Song List\n2. Add Song\n3. Play Song\n4. Exit");

        int option;
        while (true) {
            System.out.print("**** Select the Number : ");
            option = scan.nextInt();

            if (option == 1) {
                musicfunction.list();
            } else if (option == 2) {
                System.out.print("Enter Song Name : ");
                String songN = scan.next();
                System.out.print("Enter Song Length : ");
                int songL = scan.nextInt();
                System.out.println("""
                        \t1. Rock Music
                        \t2. Jazz Music
                        \t3. Pop Music
                        \t4. Electron""");
                System.out.print("Select the genre : ");
                int gen = scan.nextInt();
                String genre;
                if(gen == 1) {
                    genre = "Rock Music";
                }
                else if(gen == 2) {
                    genre = "Jazz Music";
                }
                else if(gen == 3) {
                    genre = "Pop  Music";
                }
                else {
                    genre = "Electron";
                }
                musicfunction.addSong(songN, songL, genre);
            }

            else if (option == 3) {
                musicfunction.list();
                System.out.print("Which Song Play : ");
                String playSong = scan.next();
                playsong.currentSong = playSong;
                System.out.println("--------------------\n<" + playSong + "> Song is Play\n--------------------");
                System.out.println("""
                        \t1. Pause
                        \t2. Shuffle
                        \t3. Next Song play
                        \t4. Previous Song Play
                        \t5. Volume up
                        \t6. volume down
                        \t7. Download
                        \t8. Stop""");
                int play;
                while(true) {
                    System.out.print("Enter the Number for use Function : ");
                    play = scan.nextInt();
                    if(play == 1) {
                        playsong.pause();
                    }
                    else if(play == 2) {
                        System.out.println("\t1. Repeat\n\t2. Shuffle all song");
                        System.out.print("\tEnter the Number : ");
                        int shuffle = scan.nextInt();
                        playsong.shuffle(shuffle);
                    }
                    else if(play == 3) {
                        playsong.nextSong();
                    }
                    else if(play == 4) {
                        System.out.println("Previous Song play");
                    }
                    else if(play == 5) {
                        playsong.volumeUP();
                    }
                    else if(play == 6) {
                        playsong.volumeDown();
                    }
                    else if(play == 7) {
                        playsong.download();
                    }
                    else if (play == 8) {
                        System.out.println("|X| Song is STOP |X|\n");
                        break;
                    }
                }
            }
            else if (option == 4) {
                break;
            }
        }
    }
}
