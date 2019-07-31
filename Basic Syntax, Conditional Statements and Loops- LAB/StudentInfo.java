package JavaFundamnetalsLab;


import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        double grade = Double.parseDouble(in.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name,age,grade);
    }
}
