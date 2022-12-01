package Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Configuration[] configurations = new Configuration[5];

        configurations[0]=new Configuration("16GB","512GBSSD","M1Pro","16Inch",true);
        configurations[1]=new Configuration("16GB","512GBSSD","M1","13Inch",true);
        configurations[2]=new Configuration("16GB","512GBSSD","M1","16Inch",true);
        configurations[3]=new Configuration("32GB","1024GBSSD","M1Max","16Inch",true);
        configurations[4]=new Configuration("32GB","512GBSSD","M1Max","14Inch",true);

        Computer[] computer = new Computer[5];

        computer[0] = new Computer(0, "MacBook", "Pro",configurations[0]);
        computer[1] = new Computer(1, "MacBook", "Air",configurations[1]);
        computer[2] = new Computer(2, "MacBook", "Pro",configurations[2]);
        computer[3] = new Computer(3, "MacBook", "Pro",configurations[3]);
        computer[4] = new Computer(4, "MacBook", "Air",configurations[4]);


        
        for (int i = 0; i < computer.length; i++) {
            System.out.println(computer[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter ID which you want to BUY!");
        int command = scanner.nextInt();

        for (int i = 0; i < computer.length; i++) {
            if (command == i) {
                for (int j = i; j < computer.length - 1; j++) {
                    computer[j] = computer[j + 1];
                }
            }
        }
        computer[computer.length - 1] = null;

        for (int i = 0; i < computer.length; i++) {
            if (computer[i] != null) {
                System.out.println(computer[i]);
            }
        }
    }
}
