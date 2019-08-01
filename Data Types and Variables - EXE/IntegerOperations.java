package JavaFundamentalsExe;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne = Integer.parseInt(in.nextLine());
        int numberTwo = Integer.parseInt(in.nextLine());
        int numberThree = Integer.parseInt(in.nextLine());
        int numberFour = Integer.parseInt(in.nextLine());

        int fiirstSecond = numberOne + numberTwo;
        int divide = fiirstSecond / numberThree;
        int multiply = divide  *numberFour;

        System.out.println(multiply);

    }
}
