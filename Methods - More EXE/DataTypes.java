package JavaFundamentalsExe;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        if (type.equals("int")){
            int num = Integer.parseInt(in.nextLine());
            System.out.println(operations(num));
        }else if(type.equals("real")){
            double num = Double.parseDouble(in.nextLine());
            System.out.printf("%.2f",operations(num));
        }else if (type.equals("string")){
            String line = in.nextLine();
            operations(line);
        }
    }

    static int operations(int num){
        return num*2;
    }
    static double operations(double num){
        return num * 1.5;
    }
    static void operations(String line){
        System.out.println("$"+line+"$");
    }

}
