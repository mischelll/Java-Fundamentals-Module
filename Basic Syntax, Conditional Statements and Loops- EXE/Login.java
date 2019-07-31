package JavaFundamentalsExe;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        String password = "";

        for(int i = username.length()-1; i >=0;i--){
            password += username.charAt(i);
        }

        String input = in.nextLine();
        int count = 1;
        boolean check = false;
        while (!input.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            count++;
            if (count >= 4){
                check = true;
                break;
            }

            input = in.nextLine();
        }
        if(check == true){
            System.out.printf("User %s blocked!", username);
        }else {
            System.out.printf("User %s logged in.",username);
        }

    }
}
