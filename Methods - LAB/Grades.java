package JavaFundamnetalsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grade = Double.parseDouble(in.nextLine());
        System.out.println(printGrade(grade));
    }

    static String printGrade(double grade){
        String finalGrade = "";
        if (grade >= 2.00 && grade <= 2.99){
            finalGrade = "Fail";
        }else if (grade >= 3.00 && grade <= 3.49){
            finalGrade = "Poor";
        }else if (grade >= 3.50 && grade <= 4.49){
            finalGrade = "Good";
        }else if (grade >= 4.50 && grade <= 5.49){
            finalGrade = "Very good";
        }else if (grade >= 5.50 && grade <= 6){
            finalGrade = "Excellent";
        }
        return finalGrade;
    }
}
