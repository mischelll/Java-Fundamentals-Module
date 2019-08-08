package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<String> words = new ArrayList<>(n);
        for (int i = 0; i < n;i++){
            String line = in.nextLine();
            words.add(i,line);
        }

        Collections.sort(words);
        int place = 1;
        for (String word : words) {
            System.out.printf("%d.%s\n",place,word);
            place++;
        }


    }
}
