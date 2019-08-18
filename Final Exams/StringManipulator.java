package MidExams;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String manipulator = "";
        String input = in.nextLine();


        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String action = data[0];
            if (action.equals("Add")) {
                manipulator += data[1];
            } else if (action.equals("Upgrade")) {
                char c = data[1].charAt(0);
                manipulator = manipulator.replace(c, (char) (c + 1));

            } else if (action.equals("Index")) {
                char c = data[1].charAt(0);
                if (manipulator.contains(c + "")) {
                    int index = manipulator.indexOf(c);
                    while (index >= 0) {
                        System.out.print(index + " ");
                        index = manipulator.indexOf(c, index + 1);
                    }
                    System.out.println();
                }else {
                    System.out.println("None");
                }

            }else if (action.equals("Remove")){
                String toRemove = data[1];
                manipulator = manipulator.replace(toRemove,"");
            }else if (action.equals("Print")){
                System.out.println(manipulator);
            }

            input = in.nextLine();
        }

    }
}
