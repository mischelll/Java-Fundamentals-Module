package JavaFundamnetalsLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        String name2 = in.nextLine();
        String delimeter = in.nextLine();
        System.out.println(name1 + delimeter + name2  );
    }
}
