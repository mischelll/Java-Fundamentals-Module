package JavaFundamentalsExe;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        printMatrix(n);
    }
    static void printMatrix(int n){
        for (int i = 0 ; i< n;i++){
            for (int k =0 ; k<n;k++){
                System.out.print(n +" ");
            }
            System.out.println();
        }
    }
}
