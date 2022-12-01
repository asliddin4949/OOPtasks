package Task8Songs;

import java.util.Scanner;

public class Register {

    public static void Register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("* * * S i g n * u p * * * ");

        System.out.println("Enter Your Username: ");
        String username = scanner.next();
        for (int i = 0; i < DataCache.userId; i++) {
            if(username.equals(DataCache.users[i].getUsername())){
                System.out.println("This username has already taken try again, Please!");
                Interface.Interface();
            }
        }
        for (int i = 0; i < DataCache.singers.length; i++) {
            if(DataCache.singers[i].getUsername().equals(username)){
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
        DataCache.users[DataCache.userId] = new User();
        DataCache.users[DataCache.userId].setName(name);
        DataCache.users[DataCache.userId].setUsername(username);
        DataCache.users[DataCache.userId].setPassword(password);
        DataCache.users[DataCache.userId].setPhoneNumber(phoneNumber);
        DataCache.users[DataCache.userId].setUserID(DataCache.userId);
        System.out.println("You have successfully registered up!");
        System.out.println();
        DataCache.userId++;
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
