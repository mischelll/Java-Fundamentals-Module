package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = Integer.parseInt(in.nextLine());
        String input = in.nextLine();

        String regex = "@(?<name>[A-Za-z]+)([^-@!:>]+)?![G]!";
        Pattern pattern = Pattern.compile(regex);

        List<String> obedientKids = new ArrayList<>();

        while (!input.equals("end")){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = (char) (input.charAt(i) - key);
                sb.append(c);
            }
        Matcher matcher = pattern.matcher(sb.toString());
            while (matcher.find()){
                String name = matcher.group("name");


                obedientKids.add(name);
            }

            input = in.nextLine();
        }
        for (String kid : obedientKids) {
            System.out.println(kid);
        }

    }
}
