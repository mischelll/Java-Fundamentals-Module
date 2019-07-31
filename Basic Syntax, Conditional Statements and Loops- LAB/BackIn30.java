package JavaFundamnetalsLab;

import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int hours = Integer.parseInt(in.nextLine());
        int minutes = Integer.parseInt(in.nextLine());
        int afterMin = minutes + 30;
       if(afterMin > 59){
           hours += 1;
           afterMin -= 60;
       }
       if(hours > 23){
           hours = 0;
       }

        System.out.printf("%d:%02d",hours,afterMin);
    }
}
