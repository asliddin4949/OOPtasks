package Task8Songs;

import java.util.Scanner;

public class Interface {
    public static void Interface() {
        while (true) {
            mainmenu();
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            if(command.equals("1")){
                Register.Register();
            } else if (command.equals("2")) {
                checkLogin();
            } else if (command.equals("0")) {
                System.exit(0);
            }else {
                System.err.println(" ! E ! R ! R ! O ! R !");
            }
        }
    }
    public static void mainmenu(){
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * T * O * P * * * S * O * N * G * S * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("* 1 - Sign up * * * 2 - Enter * * * 0 - exit * ");
    }

    public static void checkLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();

        if(login.equals("admin")&&password.equals("123")){
            Admin.adminInterface();
        }else {

        }

    }
}
