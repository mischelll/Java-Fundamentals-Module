package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        String[] arr = in.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(arr[i]);
            numbers.add(number);
        }

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size() / 2; i++) {
                int firstElement = numbers.get(i);
                int lastElement = numbers.get(numbers.size() - 1 - i);
                int sum = firstElement + lastElement;
                System.out.print(sum + " ");
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.size() % 2 != 0) {
                    int middleNum = numbers.get((numbers.size() / 2));
                    int firstElement = numbers.get(i);
                    if (firstElement == middleNum) {
                        System.out.print(middleNum);
                        break;
                    }
                    int lastElement = numbers.get(numbers.size() - 1 - i);
                    int sum = firstElement + lastElement;
                    System.out.print(sum + " ");

                }


            }
        }
    }
}
