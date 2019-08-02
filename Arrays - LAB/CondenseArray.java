package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = Arrays.stream(in.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int finalResult = 0;

        if (nums.length <= 1){
            System.out.println(nums[0]);
        }else {



        while(nums.length > 1){
            for (int i = 0; i< nums.length; i++){
                int[] con = new int[nums.length -1];
                for (int j = 0;j < con.length;j++){
                    con[j] = nums[j] + nums[j+1];

                }
                nums = con;
                finalResult = con[0];
            }
        }


        System.out.println(finalResult);
        }

    }
}
