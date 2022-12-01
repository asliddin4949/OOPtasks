package Task8Songs;

import java.util.Scanner;

public class Admin {
    public static void adminInterface() {
        System.out.println("* * * Admin Interface * * *");
        System.out.println("1 - add singer 2 - add song 3 - rating 0 - exit");
    }

    private static void addSinger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Singer's name: ");
        String name = scanner.next();
        System.out.println("Enter Singer's username");
        String username = scanner.next();
        System.out.println("Enter Singer's ID: ");
        int ID = scanner.nextInt();
        System.out.println("Enter Singer's Age: ");
        int age = scanner.nextInt();
        for (int i = 0; i < DataCache.userId; i++) {
            if(DataCache.users[i].getUsername().equals(username)){
                System.err.println("This username exists on platform! Please Try Again!");
                adminInterface();
            }
        }
        for (int i = 0; i < DataCache.singerId; i++) {
            if(DataCache.singers[i].getUsername().equals(username)){
                System.err.println("This username exists on platform! Please Try Again!");
                adminInterface();
            }
        }
        DataCache.singers[DataCache.singerId] = new Singer(ID,username,name,age);
        DataCache.singerId++;
    }

    private static void addSong() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Song Code:");
        int code = scanner.nextInt();
        System.out.println("Enter Song name: ");


    }

    public static void checkRating() {

    }

    public static void showSongs() {

    }
}
