package Task8Songs;

import java.util.Scanner;

public class Admin {
    public static void adminInterface() {
        System.out.println("* * * Admin Interface * * *");
        System.out.println("1 - add singer 2 - add song 3 - show songs 0 - exit");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        if(command==1){
            addSinger();
        } else if (command==2) {
            addSong();
        } else if (command==3) {
           sortByRate();
           showSongs();
           adminInterface();
        } else if (command==0) {
            Interface.interfaceMenu();
        }else {
            System.err.println("Wrong command!");
        }
    }

    private static void addSinger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Singer's name: ");
        String name = scanner.next();
        System.out.println("Enter Singer's username");
        String username = scanner.next();
        System.out.println("Enter Singer's Age: ");
        int age = scanner.nextInt();
        for (int i = 0; i < DataCache.userId; i++) {
            if (DataCache.users[i].getUsername().equals(username)) {
                System.err.println("This username exists on platform! Please Try Again!");
                adminInterface();
            }
        }
        for (int i = 0; i < DataCache.singerId; i++) {
            if (DataCache.singers[i].getUsername().equals(username)) {
                System.err.println("This username exists on platform! Please Try Again!");
                adminInterface();
            }
        }
        DataCache.singers[DataCache.singerId] = new Singer(DataCache.singerId, username, name, age);
        System.out.println("Singer successfully added!");
        DataCache.singerId++;
        adminInterface();
    }

    private static void addSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Song Code:");
        int code = scanner.nextInt();
        System.out.println("Enter Song name: ");
        scanner = new Scanner(System.in);
        String name = scanner.next();
        showSingers();
        System.out.println("Enter Singer's ID, if doesnt exist please Register Singer First! \"-1\" -exit");
        int id = scanner.nextInt();
        if (id == -1) {
            adminInterface();
        } else if (id < 0 || id > DataCache.singerId) {
            System.err.println("!!! Wrong ID !!!");
            adminInterface();
        } else {
            DataCache.songs[DataCache.songId] = new Song(code, name, DataCache.singers[id]);
            System.out.println("Song is successfully added!");
            DataCache.songId++;
            adminInterface();
        }
    }

    private static void sortByRate() {
        Song temp;
        for (int i = 0; i < DataCache.songId; i++) {
            for (int j = i; j < DataCache.songId; j++) {
                if (DataCache.songs[i].getVoteNumbers() < DataCache.songs[j].getVoteNumbers()) {
                    temp = DataCache.songs[i];
                    DataCache.songs[i] = DataCache.songs[j];
                    DataCache.songs[j] = temp;
                }
            }
        }
    }
    public static void showSongs() {
        System.out.println("* S * o * n * g * s *");
        for (int i = 0; i < DataCache.songId; i++) {
            System.out.println("Song Code: "+DataCache.songs[i].getCode()
            +"\nSong name: "+DataCache.songs[i].getName()
            +"\nSinger name: "+DataCache.songs[i].getSinger().getName()
            +"\nVotes: "+DataCache.songs[i].getVoteNumbers());
            System.out.println("< * > < * > < * >");
        }
    }
    private static void showSingers(){
        for (int i = 0; i < DataCache.singerId; i++) {
            System.out.println("ID: " + i + " Name: " + DataCache.singers[i].getName());
        }
    }
}
