package JavaFundamentalsExe;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] usernames = in.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i++) {
            char[] arr = usernames[i].toCharArray();
            boolean valid = true;
            if (arr.length >= 3 && arr.length <= 16) {
                for (int k = 0; k < arr.length; k++) {

                    if (!(Character.isLetterOrDigit(arr[k]) || arr[k] == '-' || arr[k] == '_')){
                        valid = false;
                        break;
                    }
                }
            }else {
                valid = false;
            }

            if (valid){
                System.out.println(usernames[i]);
            }
        }

    }
}
