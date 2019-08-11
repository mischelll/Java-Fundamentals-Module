package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" ")).map(a -> Integer.parseInt(a)).sorted((a,b) -> b.compareTo(a)).limit(3)
                .collect(Collectors.toList());

        numbers.forEach(a -> System.out.print(a + " "));
    }
}
