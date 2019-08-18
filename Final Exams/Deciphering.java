package MidExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] input2 = in.nextLine().split(" ");

        String regex = "^[d-z{}|#]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            String str = matcher.group();
            String decrypted = decryptStr(str);
            String finalStr = replaceStr(decrypted,input2[0],input2[1]);

            System.out.println(finalStr);
        }else {
            System.out.println("This is not the book you are looking for.");
        }

    }
    static String decryptStr(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            char c = (char) ( str.charAt(i) - 3);
            sb.append(c );
        }

        return sb.toString();
    }

    static String replaceStr(String str, String sub1, String sub2){
       return str = str.replace(sub1,sub2);
    }
}
