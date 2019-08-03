package JavaFundamentalsExe;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] arrS = line.split(" ");
        int[] inputArr = new int[arrS.length];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(arrS[i]);
        }
        for (int i = 0; i < inputArr.length; i++) {
            int temp = inputArr[i];
            boolean bigger = true;
            for (int k = i + 1; k < inputArr.length; k++) {

                if (temp <=  inputArr[k]){
                    bigger = false;
                }
            }
            if (bigger){
                System.out.print(temp + " ");
            }
            }
        }
    }
