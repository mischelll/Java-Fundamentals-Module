package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        String[] arr = in.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(arr[i]);
            nums.add(number);
        }

        String command = in.nextLine();

        while (!command.equals("end")) {
            String[] inputArr = command.split(" ");

            if (inputArr[0].equals("Contains")) {
                boolean check = nums.contains(Integer.valueOf(inputArr[1]));
                if (check) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (inputArr[0].equals("Print")) {
                evenOrOdd(inputArr,nums);

            } else if (command.equals("Get sum")) {
                int sum = 0;
                for (int num : nums) {
                    sum += num;
                }
                System.out.println(sum);
            } else if (inputArr[0].equals("Filter")) {
                filterOut(inputArr,nums);

            }


            command = in.nextLine();
        }
    }

    static void filterOut(String[] arr, List<Integer> list) {
        if (arr[1].equals("<")) {
            int number = Integer.parseInt(arr[2]);
            for (int num : list) {
                if (num < number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }else if (arr[1].equals(">")){
            int number = Integer.parseInt(arr[2]);
            for (int num : list) {
                if (num > number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }else if (arr[1].equals("<=")){
            int number = Integer.parseInt(arr[2]);
            for (int num : list) {
                if (num <= number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }else if(arr[1].equals(">=")){
            int number = Integer.parseInt(arr[2]);
            for (int num : list) {
                if (num >= number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
    static void evenOrOdd(String[] arr, List<Integer> list){
        if (arr[1].equals("even")) {
            for (int num : list) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        } else if (arr[1].equals("odd")) {
            for (int num : list) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
