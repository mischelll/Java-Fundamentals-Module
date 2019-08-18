package MidExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnimalSanctuary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        String regex = "^n:(?<name>[^;]+);t:(?<kind>[^;]+);c--(?<country>[A-Za-z\\s]+)$";
        Pattern pattern = Pattern.compile(regex);

        int totalKilos = 0;

        while (n > 0) {
            String input = in.nextLine();
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                String kind = matcher.group("kind");
                String country = matcher.group("country");

                String decryptedName = decryptName(name);
                String decryptedKind = decryptKind(kind);
                totalKilos += calcKilos(name,kind);

                System.out.printf("%s is a %s from %s\n",decryptedName,decryptedKind,country);

            }
            n--;
        }
        System.out.printf("Total weight of animals: %dKG",totalKilos);
    }

    static String decryptName(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <name.length() ; i++) {
            char c = name.charAt(i);
            if (Character.isLetter(c) || c == ' '){
                sb.append(c);
            }
        }

        return sb.toString();
    }

    static String decryptKind(String kind){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <kind.length() ; i++) {
            char c = kind.charAt(i);
            if (Character.isLetter(c) || c == ' '){
                sb.append(c);
            }
        }

        return sb.toString();
    }

    static int calcKilos(String name, String kind){
        int kilos = 0;
        for (int i = 0; i <name.length() ; i++) {
            char c = name.charAt(i);

            if (Character.isDigit(c)){
                kilos += c - '0';
            }
        }

        for (int i = 0; i <kind.length() ; i++) {
            char c = kind.charAt(i);

            if (Character.isDigit(c)){
                kilos += c - '0';
            }
        }

        return kilos;
    }



}
