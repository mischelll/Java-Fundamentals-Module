package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterGifts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> gifts = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());

        String command = in.nextLine();

        while (!command.equals("No Money")){
            String[] input = command.split(" ");
            String action = input[0];

            if (action.equals("OutOfStock")){
                while (gifts.contains(input[1])){
                    gifts.set(gifts.indexOf(input[1]),"None");
                }
            }else if (action.equals("Required")){
                int index = Integer.parseInt(input[2]);
                if (index >= 0 && index < gifts.size()){
                    gifts.set(index,input[1]);
                }
            }else if (action.equals("JustInCase")){
                int indexLastGift = gifts.size() - 1;

                gifts.set(indexLastGift,input[1]);
            }

            command = in.nextLine();

        }

        for (String gift : gifts) {
            if (gift.equals("None")){
                continue;
            }
            System.out.print(gift + " ");
        }

    }
}
