package LambdaExpression.Task1;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Alisher","Ali", "Bahodir","Sunnat","Abdimumin","Hadyatillo","Sanjar","Bekzod","Jahongir","Muhammadyusuf"};

        Expression expression = string -> string.length()<5;

      //  showNames(arr,expression);


        Users[] users = new Users[5];

        users[0] = new Users();
        users[1] = new Users();
        users[2] = new Users();
        users[3] = new Users();
        users[4] = new Users();

        users[0].setUsername("Asliddin",users,users[0].usernameCheck);
        users[1].setUsername("Asliddin",users,users[1].usernameCheck);
        users[2].setUsername("Alisher",users,users[2].usernameCheck);
        users[3].setUsername("Alisher",users,users[3].usernameCheck);
        users[4].setUsername("Sanjar",users,users[4].usernameCheck);





    }


    public static void showNames(String[] strings, Expression expression){

        for (String string : strings) {
           if(expression.checkElement(string)){
               System.out.println(string);
           }
        }

    }
}
