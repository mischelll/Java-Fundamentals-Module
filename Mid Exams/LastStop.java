package MidExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> paintings = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());

        String command = in.nextLine();

        while (!command.equals("END")){
            String[] input = command.split(" ");
            String action = input[0];

            if (action.equals("Change")){
                String painting = input[1];
                String changedNumber = input[2];

                if (paintings.contains(painting)){
                    paintings.set(paintings.indexOf(painting),changedNumber);
                }
            }else if (action.equals("Hide")){
                String paintingToRemove = input[1];
                if (paintings.contains(paintingToRemove)){
                    paintings.remove(paintingToRemove);
                }
            }else if (action.equals("Insert")){
                int index = Integer.valueOf(input[1]) + 1;
                String painting = input[2];

                if (index < paintings.size()){
                    paintings.add(index,painting);
                }
            }else if (action.equals("Reverse")){
                Collections.reverse(paintings);
            }else if (action.equals("Switch")){
                String painting1 = input[1];
                String painting2 = input[2];

                if (paintings.contains(painting1) && paintings.contains(painting2)){
                    Collections.swap(paintings,paintings.indexOf(painting1),paintings.indexOf(painting2));
                }
            }

            command = in.nextLine();
        }

        for (String painting : paintings) {
            System.out.print(painting + " ");
        }


    }
}
