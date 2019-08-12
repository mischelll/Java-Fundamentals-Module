package JavaFundamnetalsLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] arr = line.toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < arr.length;i++){
            if (Character.isDigit(arr[i])){
                digits.append(arr[i]);
            }else if (Character.isLetter(arr[i])){
                letters.append(arr[i]);
            }else if (!Character.isLetterOrDigit(arr[i])){
                other.append(arr[i]);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);

    }
}
