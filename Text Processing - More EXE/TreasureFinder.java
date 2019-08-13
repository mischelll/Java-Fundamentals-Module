package JavaFundamentalsExe;

import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        key = key.replace(" ", "");


        String input = in.nextLine();
        while (!input.equals("find")) {
            StringBuilder sb = new StringBuilder();
            int k = 0;
            for (int i = 0; i < key.length() && k < input.length(); i++) {

                int c = key.charAt(i) - '0';
                int m = (int) input.charAt(k) - c;

                sb.append((char) m);
                if (i == key.length() - 1) {
                    i = -1;

                }
                k++;
            }
            int indexOfAmpersand = sb.indexOf("&");
            int LastindexOfAmpersand = sb.lastIndexOf("&");
            String material = sb.substring(indexOfAmpersand + 1, LastindexOfAmpersand);

            int smaller = sb.indexOf("<");
            int bigger = sb.indexOf(">");
            String coordinates = sb.substring(smaller + 1, bigger);
            System.out.printf("Found %s at %s\n", material, coordinates);

            input = in.nextLine();
        }

    }
}
