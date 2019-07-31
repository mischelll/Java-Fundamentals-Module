package JavaFundamnetalsLab;

import java.util.Scanner;

public class MonthPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = Integer.parseInt(in.nextLine());
        String dayName = "";
        switch(month){
            case 1:
                dayName = "January";
                break;
            case 2:
                dayName = "February";
                break;
            case 3:
                dayName = "March";
                break;
            case 4:
                dayName = "April";
                break;
            case 5:
                dayName = "May";
                break;
            case 6:
                dayName = "June";
                break;
            case 7:
                dayName = "July";
                break;
            case 8:
                dayName = "August";
                break;
            case 9:
                dayName = "September";
                break;
            case 10:
                dayName = "October";
                break;
            case 11:
                dayName = "November";
                break;
            case 12:
                dayName = "December";
                break;
            default:
                System.out.println("Error!");
                break;
        }

        System.out.println(dayName);
    }
}
