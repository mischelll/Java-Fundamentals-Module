package JavaFundamnetalsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();
        String line = in.nextLine();
        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            double number = Double.parseDouble(arr[i]);
            nums.add(number);
        }

        int index = 0;

        while(index < nums.size() - 1){
            double current = nums.get(index);
            double next = nums.get(index + 1);

            if (current == next){
                double sum = current + next;
                nums.set(index,sum);
                nums.remove(index + 1);
                index = 0;
            }else {
                index++;
            }
        }

        for (double num : nums) {
            String pattern = "0.#";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String format = decimalFormat.format(num);
            System.out.print(format + " ");
        }


    }
}