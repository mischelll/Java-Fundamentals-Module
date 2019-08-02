package JavaFundamentalsExe;

import java.util.Scanner;

public class LeftRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for(int i = 1;i<=n;i++){
            String line1 = in.nextLine();
            String left = "";
            String right = "";
            boolean toRight = false;
            for(int k = 0;k < line1.length();k++){
                char c = line1.charAt(k);

                if (c == ' ' && toRight == false){
                    toRight = true;
                    continue;
                }else if(toRight == false){
                    left += c;
                }
                if (toRight){
                    right += c;
                }
            }

            long number1 = Long.parseLong(left);
            long number2 = Long.parseLong(right);
            int sumOfBiggest = 0;

            if (number1 > number2){
                long leftNumber = Math.abs(number1);
                while(leftNumber > 0){
                    sumOfBiggest += leftNumber % 10;
                    leftNumber /= 10;
                }
                System.out.println(Math.abs(sumOfBiggest));
            }else {
                long rightNumber = Math.abs(number2);
                while(rightNumber > 0){
                    sumOfBiggest += rightNumber % 10;
                    rightNumber /= 10;
                }
                System.out.println(Math.abs(sumOfBiggest));
            }
        }
    }
}
