package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int iterations = Integer.parseInt(in.nextLine());
        List<String> names = new ArrayList<>();

        while (iterations > 0){
            String[] input = in.nextLine().split(" ");

            if (input[1].equals("is") && input[2].equals("going!")){
                if (names.contains(input[0])){
                    System.out.println(input[0] + " is already in the list!");
                }else {
                    names.add(input[0]);
                }

            }else if (input[2].equals("not")){
                if (!names.contains(input[0])){
                    System.out.println(input[0] + " is not in the list!");
                }else {
                    names.remove(input[0]);
                }

            }
            iterations--;
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
