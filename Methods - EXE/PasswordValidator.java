package JavaFundamentalsExe;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();

        boolean digits = countDigits(pass);
        boolean length = lengthPass(pass);
        boolean lettersAndDigits = checkLettAndDig(pass);
        if (digits && length && lettersAndDigits){
            System.out.println("Password is valid");
        }else {
            if (!length){
                System.out.println("Password must be between 6 and 10 characters");
            }
            if(!lettersAndDigits){
                System.out.println("Password must consist only of letters and digits");
            }
            if (!digits){
                System.out.println("Password must have at least 2 digits");
            }
        }


    }
    static boolean countDigits(String line){
        int digits = 0;
        for (int i = 48; i <= 57;i++){
            for (int j = 0; j < line.length(); j++) {
                int c =  line.charAt(j);
                if (c == i){
                    digits++;
                }
            }
        }
        if (digits < 2){
            return false;
        }
        return true;

    }

    static boolean lengthPass(String line){
        if (!(line.length() >= 6 && line.length() <= 10)){

            return false;
        }
        return true;

    }

    static boolean checkLettAndDig(String line){
        boolean check = true;
        for (int i =0 ; i < line.length();i++){
            char c1 = line.charAt(i);
            check = Character.isLetterOrDigit(c1);
            if (!check){
                return false;
            }
        }
        return true;
    }
}
