package JavaFundamentalsExe;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        printMiddeChar(line);

    }

    static void printMiddeChar(String line){
        if (line.length() % 2 == 0){
            char[] c = line.toCharArray();
            int middle = line.length() / 2;
            System.out.println(c[middle-1] +""+c[middle]);

        }else{
            char[] c = line.toCharArray();
            double middle = Math.ceil(line.length() / 2);
            System.out.println(c[(int)middle]);
        }
    }
}
