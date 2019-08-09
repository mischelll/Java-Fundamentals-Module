package JavaFundamentalsExe;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] people = new int[n];
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(in.nextLine());
            sum += people[i];
        }

        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
