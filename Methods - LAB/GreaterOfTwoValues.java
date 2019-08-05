package JavaFundamnetalsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        if (type.equals("string")) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String result = getMax(s1, s2);
            System.out.println(result);
        }
        if(type.equals("int")){
            int num1 = Integer.parseInt(in.nextLine());
            int num2 = Integer.parseInt(in.nextLine());
            int result = getMax(num1,num2);
            System.out.println(result);
        }
        if (type.equals("char")){
            char c1 = in.nextLine().charAt(0);
            char c2 = in.nextLine().charAt(0);
            char c3 = getMax(c1,c2);
            System.out.println(c3);
        }
    }

    static int getMax(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
    }

    static String getMax(String s1, String s2){

        if (s1.compareTo(s2) >= 0){
            return s1;
        }else {
            return s2;
        }

    }

    static char getMax(char c1, char c2){

        if (c1 > c2){
            return  c1;
        }else {
            return c2;
        }
    }
}
