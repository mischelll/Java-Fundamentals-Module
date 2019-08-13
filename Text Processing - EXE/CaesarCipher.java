package JavaFundamentalsExe;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line  = in.nextLine();

        List<Character> listCh = line.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        for (int i = 0; i < listCh.size() ; i++) {
            int plusThree = listCh.get(i) + 3;
            listCh.set(i, (char) plusThree);
        }

        for (Character ch : listCh) {
            System.out.print(ch);
        }

    }
}
