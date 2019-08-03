package JavaFundamentalsExe;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String values1 = in.nextLine();
        String values2 = in.nextLine();
        String[] arr1 = values1.split(" ");
        String[] arr2 = values2.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr1.length; k++) {
                if (arr2[i].equals(arr1[k])){
                    System.out.print(arr2[i] + " ");
                }
            }
            }
        }
    }
