package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0;i < arr.length;i++){
            int number = Integer.parseInt(arr[i]);
            nums.add(number);
        }

        removeNegatives(nums);
        printListReversed(nums);



    }

    static void removeNegatives(List<Integer> list){
        list.removeIf(n -> (n < 0));
        if (list.isEmpty()){
            System.out.println("empty");
        }
    }

    static void printListReversed(List<Integer> list){
        Collections.reverse(list);
        for (int integer : list) {
            System.out.print(integer + " ");
        }

    }

}
