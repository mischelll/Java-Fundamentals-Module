package JavaFundamentalsExe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().replaceAll(" ", "");
        String newLine = line.replaceAll(""," ");
        String[] arr = newLine.split("\\|+");

        for (int i = arr.length- 1; i >=0;i--){
            if (arr[i].equals(" ")){
                continue;
            }
            System.out.print(arr[i].trim()+ " ");
        }

    }
}