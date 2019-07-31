package JavaFundamnetalsLab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String country = in.nextLine();
        String language = "";
        switch (country){
            case "USA":
                language = "English";
                break;
            case "England":
                language = "English";
                break;
            case "Spain":
                language = "Spanish";
                break;
            case "Argentina":
                language = "Spanish";
                break;
            case "Mexico":
                language = "Spanish";
                break;
            default:
                System.out.println("unknown");
                break;
        }
        System.out.println(language);
    }
}
