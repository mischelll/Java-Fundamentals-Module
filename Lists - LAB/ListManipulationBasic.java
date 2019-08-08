package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        String[] arr = in.nextLine().split(" ");
        for (int i = 0;i < arr.length;i++){
            int number = Integer.parseInt(arr[i]);
            nums.add(number);
        }

        String command = in.nextLine();
        while (!command.equals("end")){
            String[] inputArr = command.split(" ");
            if (inputArr[0].equals("Add")){
                nums.add(Integer.parseInt(inputArr[1]));
            }else if (inputArr[0].equals("Remove")){
                int number = Integer.parseInt(inputArr[1]);
                while (nums.remove(Integer.valueOf(number))){

                }

            }else if (inputArr[0].equals("RemoveAt")){
                int index= Integer.parseInt(inputArr[1]);
                nums.remove(index);

            }else if (inputArr[0].equals("Insert")){
                int number = Integer.parseInt(inputArr[1]);
                int index = Integer.parseInt(inputArr[2]);
                nums.add(index,number);
            }

            command = in.nextLine();
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
