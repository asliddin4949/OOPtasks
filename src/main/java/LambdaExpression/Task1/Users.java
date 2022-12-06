package LambdaExpression.Task1;

public class Users {
    String name;
    String username;
    String password;


     UsernameCheck usernameCheck = (str, users) -> {
            for (int i = 0; i < users.length; i++) {
                if (users[i].username != null && users[i].username.equals(str)) {
                    return false;
                }
            }
        return true;
    };

    public void setUsername(String username, Users[] users, UsernameCheck expression) {
        if (expression.checkUsernames(username, users)) {
            this.username = username;
            System.out.println("username added");
        } else {
            System.out.println("this username exists");
        }
    }
}
