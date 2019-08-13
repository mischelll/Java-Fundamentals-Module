package JavaFundamentalsExe;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input1 = in.next();
        String input2 = in.next();
        System.out.println(characterMultiplier(input1,input2));

    }

    static long characterMultiplier(String str1, String str2) {
        long sum = 0;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length;i++){
                sum += arr1[i] * arr2[i];
            }

        }else if (arr1.length > arr2.length){
            for (int i = 0; i < arr2.length; i++) {
                sum += arr1[i] * arr2[i];
            }

            for (int i = arr2.length; i < arr1.length;i++){
                sum += arr1[i];
            }

        }else if (arr1.length < arr2.length){
            for (int i = 0; i <arr1.length ; i++) {
                sum += arr1[i] * arr2[i];
            }

            for (int i = arr1.length; i < arr2.length;i++){
                sum += arr2[i];
            }

        }
        return sum;
    }
}
