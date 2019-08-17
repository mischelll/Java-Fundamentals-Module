package MidExams;

import java.util.Scanner;

public class Giftbox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sizeOfSide = Double.parseDouble(in.nextLine());
        int numberSheetsOfPaper = Integer.parseInt(in.nextLine());
        double areaOfOneSheet = Double.parseDouble(in.nextLine());

        double area = sizeOfSide * sizeOfSide * 6;

        double areaToCover = 0;

        for (int i  = 1; i <= numberSheetsOfPaper;i++){
            if (i % 3 == 0){
                areaToCover += (areaOfOneSheet * 0.25);
            }else {
                areaToCover += areaOfOneSheet;
            }
        }

        double result = (areaToCover/area) * 100;
        System.out.printf("You can cover %.2f%% of the box.",result);
    }
}
