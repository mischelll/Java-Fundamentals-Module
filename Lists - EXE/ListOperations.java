package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        String[] arr = in.nextLine().split(" ");
        for (int i = 0;i < arr.length;i++){
            int number = Integer.parseInt(arr[i]);
            nums.add(number);
        }

        String command = in.nextLine();
        while (!command.equals("End")){
            String[] input = command.split(" ");

            if (input[0].equals("Add")){
                int toAdd = Integer.parseInt(input[1]);
                nums.add(toAdd);

            }else if (input[0].equals("Insert")){
                int toInsert = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                if (index  < nums.size() && index >= 0){
                    nums.add(index,toInsert);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (input[0].equals("Remove")){
                int toRemove = Integer.parseInt(input[1]);
                if (toRemove < nums.size() && toRemove >= 0){
                    nums.remove(toRemove);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (input[1].equals("left")){
                int count = Integer.parseInt(input[2]);
                while (count > 0){
                    nums.add(nums.remove(0));
                    count--;
                }
            }else if(input[1].equals("right")){
                int count = Integer.parseInt(input[2]);
                while (count > 0){
                    int number  = nums.remove(nums.size()-1);
                    nums.add(0,number);
                    count--;
                }
            }

            command = in.nextLine();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
