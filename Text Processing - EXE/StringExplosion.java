package JavaFundamentalsExe;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = line.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            sb.append(c);
            if (c == '>') {
                i++;
                int power = arr[i] - '0';
                int j = i;
                for (; j < power + i && j < line.length(); j++){
                    char m = arr[j];
                    if (m =='>'){
                        sb.append('>');
                        power += (arr[j + 1] -'0') +1;
                    }

                }
                i = j - 1;

            }
        }
        System.out.println(sb.toString());
    }
}
