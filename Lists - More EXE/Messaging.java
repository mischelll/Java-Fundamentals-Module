package JavaFundamentalsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());
        String input = in.nextLine();

        char[] message = new char[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            if (sum > input.length()) {
                while (sum > input.length()) {
                    sum -= input.length();
                }
                message[i] = input.charAt(sum);
                input = charRemoveAt(input,sum);


            }else {
                message[i] = input.charAt(sum);
                input = charRemoveAt(input,sum);
            }


        }

        for (char c : message) {
            System.out.print(c);
        }


    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
