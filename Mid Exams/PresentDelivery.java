package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> houseMembers = Arrays.stream(in.nextLine().split("@")).map(Integer::new).collect(Collectors.toList());
        int index = 0;

        String command = in.nextLine();
        while (!command.equals("Merry Xmas!")) {
            String[] input = command.split(" ");
            int length = Integer.parseInt(input[1]);
            index += length;

            while (index >= houseMembers.size()) {
                index = Math.abs(houseMembers.size() - index);
            }
            if (houseMembers.get(index) == 0) {
                System.out.printf("House %d will have a Merry Christmas.\n", index);
            } else {
                houseMembers.set(index, houseMembers.get(index) - 2);
            }

                command = in.nextLine();
            }

        boolean check = true;
        int count = 0;
        for (int houseMember : houseMembers) {
            if (houseMember != 0){
                check = false;
                count++;
            }

        }
        System.out.printf("Santa's last position was %d.\n",index);
        if (check){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Santa has failed %d houses.",count);
        }
        }



    }

