package JavaFundamentalsExe;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(countVowels(line));
    }

    static int countVowels(String line){
        char[] vowels= {'A','E','I','U','O','Y','a','e','i','o','u','y',};
        char[] lineToArr = line.toCharArray();
        int count = 0;
        for (int i  =0 ; i < lineToArr.length;i++){
            for (int k = 0 ; k < vowels.length;k++){
                if (lineToArr[i] == vowels[k]){
                    count++;
                }
            }
        }
        return count;
    }
}
