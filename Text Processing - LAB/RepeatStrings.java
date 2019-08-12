package JavaFundamnetalsLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();


        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                sb.append(word);
            }
        }
        System.out.println(sb);


        // for (int i = 0; i <words.length ; i++) {
        //    for (int k = 0; k < words[i].length();k++){
           //     System.out.print(words[i]);
            //}
       // }



    }
}
