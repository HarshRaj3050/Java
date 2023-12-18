package College_Practical;
import java.util.Scanner;

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
    public void addSong(String songN, int songL) {
        for (int i = 0; i < songName.length; i++) {
            if (songName[i] == null) {
                songName[i] = songN;
                songLength[i] = songL;
                break;
            }
        }
        System.out.println("!! Song is Add Successful !!\n");
    }
    public void playSong(String playSong) {

    }
}
class PlaySong extends MusicFunction {
    public void shuffle(int shuffle) {
        if(shuffle == 1) {
            System.out.println("Repeat ");
        }
    }
    public void pause() {
        System.out.println("Pause the Song");
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

        int option = 0;

        while (option != 4) {
            System.out.print("**** Select the Number : ");
            option = scan.nextInt();

            if (option == 1) {
                musicfunction.list();
            } else if (option == 2) {
                System.out.print("Enter Song Name : ");
                String songN = scan.next();
                System.out.print("Enter Song Length : ");
                int songL = scan.nextInt();
                musicfunction.addSong(songN, songL);
            }

            else if (option == 3) {
                musicfunction.list();
                System.out.print("Which Song Play : ");
                String playSong = scan.next();
                System.out.println("--------------------\n<" + playSong + "> Song is Play\n--------------------");
                System.out.println("\t1. Pause\n\t2. Shuffle\n\t3. Next Song play\n\t4. Previous Song Play" +
                        "\n\t5. Volume up\n\t6. volume down\n\t7. Download\n\t8. Stop");
                int play = 0;
                while(play != 8) {
                    System.out.print("Enter the Number for use Function");
                    play = scan.nextInt();
                    if(play == 1) {
                        System.out.println("pause");
                    }
                    else if(play == 2) {
                        System.out.println("\t1. Repeat\n\t2. Shuffle all song");
                        System.out.print("\tEnter the Number : ");
                        int shuffle = scan.nextInt();
                        playsong.shuffle(shuffle);
                    }
                    else if(play == 3) {
                        System.out.println("Next Song play");
                    }
                    else if(play == 4) {
                        System.out.println("Previous Song play");
                    }
                    else if(play == 5) {
                        System.out.println("Volume up");
                    }
                    else if(play == 6) {
                        System.out.println("Volume down");
                    }
                    else if(play == 7) {
                        System.out.println("Download");
                    }
                    else if (play == 8) {
                        System.out.println("song is STOP");
                        break;
                    }
                }
                musicfunction.playSong(playSong);
            }
            else if (option == 4) {
                break;
            }
        }
    }
}
