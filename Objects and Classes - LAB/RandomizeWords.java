package JavaFundamnetalsLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(" ");
        Random rnd = new Random();


        for (int i = 0; i < words.length;i++){
            int random = rnd.nextInt(words.length);

            if (i != random){
                String old = words[i];
                words[i] = words[random];
                words[random] = old;
            }


        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
