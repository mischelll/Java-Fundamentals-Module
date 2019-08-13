package JavaFundamentalsExe;

import java.util.Scanner;

public class ExtractPersonalInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        while (n > 0) {
            String line = in.nextLine();

            int nameSign1 = line.indexOf("@");
            int nameSign2 = line.indexOf("|");

            int ageSign1 = line.indexOf("#");
            int ageSign2 = line.indexOf("*");

            String name = "";
            String age = "";

            for (int i = 0; i < line.length(); i++) {
                name = line.substring(nameSign1, nameSign2 + 1);
                age = line.substring(ageSign1, ageSign2 + 1);
            }
            name = name.replace("@","");
            name = name.replace("|","");

            age = age.replace("#","");
            age = age.replace("*","");

            System.out.printf("%s is %s years old.\n",name,age);
            n--;
        }


    }
}
