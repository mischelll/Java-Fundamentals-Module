package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<Character> arr = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (char c : input.toCharArray()) {
            arr.add(c);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= '0' && arr.get(i) <= '9') {
                numbers.add(Character.getNumericValue(arr.get(i)));
            }
        }
        arr.removeIf(i -> i >= '0' && i <= '9');

        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                take.add(numbers.get(i));
            } else {
                skip.add(numbers.get(i));
            }
        }

        int skipCount = 0;
        int takeCount = 0;
        StringBuilder str = new StringBuilder();

        for (char character : arr) {
            str.append(character);
        }

        String arrToString = str.toString();
        String add = "";
        for (int i = 0; i < take.size(); i++) {

            add += (arrToString.substring(skipCount, take.get(i) + skipCount));

            skipCount += skip.get(i) + take.get(i);

        }


        System.out.println(add);


    }


}
