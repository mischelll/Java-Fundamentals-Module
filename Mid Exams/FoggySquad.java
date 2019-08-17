package MidExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FoggySquad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> names = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());

        while (true) {
            String[] data = in.nextLine().split(" ");
            String action = data[0];

            if (action.equals("Join")) {
                names.add(data[1]);



            } else if (action.equals("Jump")) {

                int index = Integer.parseInt(data[2]);

                if (index >= 0 && index < names.size()) {

                    names.add(index, data[1]);
                }



            } else if (action.equals("Dive")) {
                int index = Integer.parseInt(data[1]);

                if (index >= 0 && index < names.size()) {
                    names.remove(index);
                }


            } else if (action.equals("Last")) {
                int count = Integer.parseInt(data[1]);

                if (count > names.size()) {
                    for (String name : names) {
                        System.out.print(name + " ");
                    }
                    System.out.println();

                } else {
                    int startIndex = names.size()  - count;
                    if (startIndex >= 0) {
                        for (int i = startIndex; i < names.size(); i++) {
                            System.out.print(names.get(i) + " ");
                        }
                        System.out.println();
                    }
                }

            } else if (action.equals("First")) {
                int count = Integer.parseInt(data[1]);

                if (count > names.size()) {
                    for (String name : names) {
                        System.out.print(name + " ");
                    }
                    System.out.println();
                } else {
                    int endIndex = count;
                    if (endIndex < names.size()) {
                        for (int i = 0; i < endIndex; i++) {
                            System.out.print(names.get(i) + " ");

                        }
                        System.out.println();
                    }
                }




            }else if (data[1].equals("Normal")){

                System.out.print("Frogs: ");
                for (String name : names) {
                    System.out.printf("%s ",name);
                }
                break;

            }else if (data[1].equals("Reversed")){
                Collections.reverse(names);

                System.out.print("Frogs: ");
                for (String name : names) {
                    System.out.printf("%s ",name);
                }
                break;

            }

        }
    }
}
