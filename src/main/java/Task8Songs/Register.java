package Task8Songs;

import java.util.Scanner;

public class Register {
    public static int userId=0;
    public static User[] users = new User[100];

    public static void Register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("* * * S i g n * u p * * * ");

        System.out.println("Enter Your Username: ");
        String username = scanner.next();
        for (int i = 0; i < userId; i++) {
            if(username.equals(users[i].getUsername())){
                System.out.println("This username has already taken try again, Please!");
                Interface.Interface();
            }
        }
        System.out.println("Enter Your Password: ");
        String password = getpassword();
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Enter Your Phone Number");
        String phoneNumber = scanner.next();
        users[userId].setName(name);
        users[userId].setUsername(username);
        users[userId].setPassword(password);
        users[userId].setPhoneNumber(phoneNumber);
        users[userId].setUserID(userId);
        userId++;
        Interface.Interface();
    }

    public static String getpassword(){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if(password.length()>3){
            return password;
        }else {
            System.err.println("Password should be at least 4 signs!");
            return getpassword();
        }
    }
}
