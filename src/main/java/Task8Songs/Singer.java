package Task8Songs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter

public class Singer {

    private int Id;
    private String username;
    private String name;
    private int age;

    public static void singerInterface(){
        System.out.println("*** Singer *** Interface ***");
        System.out.println("* 1 - show my songs * 0 - exit *");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if(command==1){
            for (int i = 0; i < DataCache.songId; i++) {
                if(DataCache.songs[i].getSinger().equals(DataCache.singers[DataCache.dynamicID])){

                    System.out.println("Song Code: "+DataCache.songs[i].getCode()
                            +"\nSong name: "+DataCache.songs[i].getName()
                    +"\nNumber of votes: "+DataCache.songs[i].getVoteNumbers());
                    System.out.println("< - * - > < - * - > < - * - >");
                }
            }
            singerInterface();
        } else if (command==0) {
            Interface.interfaceMenu();
        }else {
            System.err.println("! E ! R ! R ! O ! R !");
            singerInterface();
        }
    }

}
