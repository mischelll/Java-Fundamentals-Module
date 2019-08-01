package JavaFundamentalsExe;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = Integer.parseInt(in.nextLine());
        int capacity = Integer.parseInt(in.nextLine());

        double courses = Math.ceil(people / (double) capacity) ;
        System.out.println((int) courses);
    }
}
