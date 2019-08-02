package JavaFundamentalsExe;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int opened = 0;
        int closed = 0;
        boolean equal = false;

        for (int i = 0; i < n;i++){
            String input = in.nextLine();

            if (input.equals("(")){
                opened++;
                equal = false;
            }else if(input.equals(")")){
                closed++;
                equal = true;
            }
        }

        if (equal && (opened == closed)){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
