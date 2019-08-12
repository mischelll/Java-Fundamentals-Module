package JavaFundamnetalsLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String text = in.nextLine();


        while(text.contains(word)){
            text = text.replace(word,"");
        }
        System.out.println(text);
    }
}
