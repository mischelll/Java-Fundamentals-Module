package MidExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> shops = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(in.nextLine());

        while (n > 0) {
            String[] input = in.nextLine().split(" ");
            String action = input[0];

            if (action.equals("Include")) {
                shops.add(input[1]);
            } else if (action.equals("Visit")) {
                if (Integer.parseInt(input[2]) <= shops.size()) {

                    if (input[1].equals("first")) {
                        int numberOfShops = Integer.parseInt(input[2]);
                        while (numberOfShops > 0) {
                            if (shops.isEmpty()) {
                                break;
                            }
                            shops.remove(0);
                            numberOfShops--;
                        }
                    } else {
                        int numberOfShops = Integer.parseInt(input[2]);
                        while (numberOfShops > 0) {
                            if (shops.isEmpty()) {
                                break;
                            }
                            shops.remove(shops.size() - 1);
                            numberOfShops--;
                        }
                    }
                }
            } else if (action.equals("Prefer")) {
                if (!shops.isEmpty()) {
                    int index1 = Integer.parseInt(input[1]);
                    int index2 = Integer.parseInt(input[2]);
                    if (index1 >= 0 && index1 < shops.size() && index2 >= 0 && index2 < shops.size()) {
                        String element1 = shops.get(index1);
                        String element2 = shops.get(index2);


                        if (shops.contains(element1) && shops.contains(element2)) {
                            Collections.swap(shops, index1, index2);
                        }
                    }
                }

            } else if (action.equals("Place")) {
                int index = Integer.parseInt(input[2]) + 1;
                if (index >= -1 && index < shops.size()) {
                    shops.add(index, input[1]);
                }
            }

            n--;
        }

        System.out.println("Shops left: ");
        for (String shop : shops) {
            System.out.print(shop + " ");
        }

    }
}
