package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> badKids = Arrays.stream(in.nextLine().split("&")).collect(Collectors.toList());

        String command = in.nextLine();
        while (!command.equals("Finished!")) {
            String[] input = command.split(" ");
            String action = input[0];

            if (action.equals("Bad")) {
                if (!badKids.contains(input[1])) {
                    badKids.add(0, input[1]);
                }
            } else if (action.equals("Good")) {
                if (badKids.contains(input[1])) {
                    badKids.remove(input[1]);
                }
            } else if (action.equals("Rename")) {
                if (badKids.contains(input[1])) {
                    badKids.set(badKids.indexOf(input[1]), input[2]);
                }
            }else if (action.equals("Rearrange")){
                if (badKids.contains(input[1])){
                    badKids.add(badKids.remove(badKids.indexOf(input[1])));
                }
            }

            command = in.nextLine();

        }

        String result = String.join(", ",badKids);
        System.out.println(result);
    }
}
