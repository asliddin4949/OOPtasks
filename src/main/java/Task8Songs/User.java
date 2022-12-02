package Task8Songs;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class User {
    private int userID;
    private String username;
    private String password;
    private String name;
    private String phoneNumber;

    public static void userInterface() {
        System.out.println("* W e l c o m e t * T o p * S o n g s *");
        System.out.println("* 1 - show songs * 0 - exit *");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if(command==1){
            Admin.showSongs();
            voteForSong();
            userInterface();
        } else if (command==0) {
            Interface.interfaceMenu();
        } else {
            System.err.println("! E ! R ! R ! O ! R !");
        }
    }
    private static void voteForSong(){
        boolean flag = true;
        System.out.println("Enter song code for vote: \"-1\" - exit");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        if(code==-1){
            userInterface();
        }else {
            for (int i = 0; i < DataCache.songId; i++) {
                if(code==DataCache.songs[i].getCode()){
                     DataCache.songs[i].addVote();
                     flag=false;
                    System.out.println("Successfully voted!");
                     userInterface();
                }
            }
            if(flag){
                System.err.println("Wrong code!");
                userInterface();
            }
        }
    }

}
