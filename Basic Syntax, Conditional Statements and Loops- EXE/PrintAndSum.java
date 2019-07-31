import java.util.Scanner;

public class PrinSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = Integer.parseInt(in.nextLine());
        int end = Integer.parseInt(in.nextLine());
        int sum = 0;
        for (int i = start; i <= end;i++){
            System.out.print(i);
            System.out.print(" ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}