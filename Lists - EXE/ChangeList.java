package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        String[] arr = in.nextLine().split("\\s+");
        for (int i = 0;i < arr.length; i++){
            int number = Integer.parseInt(arr[i]);
            nums.add(number);
        }

        String command = in.nextLine();

        while (!command.equals("end")){
            String[] inputArr = command.split("\\s+");

            if (inputArr[0].equals("Delete")){
                int toRemove = Integer.parseInt(inputArr[1]);
                while (nums.remove(Integer.valueOf(toRemove))){
                }

            }else if (inputArr[0].equals("Insert")){
                int toInsert = Integer.parseInt(inputArr[1]);
                int index = Integer.parseInt(inputArr[2]);
                if (index < nums.size() && index >= 0){
                    nums.add(index,toInsert);

                }


            }

            command = in.nextLine();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}