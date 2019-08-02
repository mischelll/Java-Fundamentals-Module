import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int end = Integer.parseInt(in.nextLine());
        for (int start = 2; start <= end; start++) {
            boolean prime = true;
            for (int  divider = 2; divider < start; divider++) {
                if (start % divider == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", start, prime);
        }

    }
}