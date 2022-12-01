package Task8Songs;

import java.util.Scanner;

public class Interface {

    public static void interfaceMenu() {
        while (true) {
            mainmenu();
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            switch (command) {
                case "1" -> Register.register();
                case "2" -> checkLogin();
                case "0" -> System.exit(0);
                default -> System.err.println(" ! E ! R ! R ! O ! R !");
            }
        }
    }

    private static void mainmenu() {
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * T * O * P * * * S * O * N * G * S * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("* 1 - Sign up * * * 2 - Enter * * * 0 - exit * ");
    }

    private static void checkLogin() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        if (login.equals("admin") && password.equals("123")) {
            Admin.adminInterface();
        } else {
            for (int i = 0; i < DataCache.userId; i++) {
                if (login.equals(DataCache.users[i].getUsername()) && password.equals(DataCache.users[i].getPassword())) {
                    DataCache.dynamicID = DataCache.users[i].getUserID();
                    User.userInterface();
                }
            }
            for (int i = 0; i < DataCache.singerId; i++) {
                if (login.equals(DataCache.singers[i].getUsername()) && password.equals("123")) {
                    DataCache.dynamicID = DataCache.singers[i].getId();
                    flag = false;
                    Singer.singerInterface();
                }
            }
            if (flag) {
                System.err.println("You entered wrong username or password!");
            }
            interfaceMenu();
        }
    }
}
