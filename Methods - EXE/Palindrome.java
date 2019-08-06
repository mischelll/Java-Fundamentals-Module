package JavaFundamentalsExe;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (!line.equals("END")) {
            boolean check = isPalindrome2(line);
            System.out.println(check);

            line = in.nextLine();
        }
    }

    static boolean isPalindrome(String line) {
        String reverse = new StringBuilder(line).reverse().toString();
        if (line.equals(reverse)) {
            return true;
        }
        return false;
    }

    static boolean isPalindrome2(String line) {
        char[] arr = line.toCharArray();
        char[] reverseArr = new char[arr.length];
        for (int i = 0; i < reverseArr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == reverseArr[i]) {
                check = true;
            } else {
                check = false;
                break;
            }


        }
        return check;
    }

}
