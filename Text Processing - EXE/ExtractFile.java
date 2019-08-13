package JavaFundamentalsExe;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String name = "";
        String extension = "";

        int lastDash = path.lastIndexOf("\\");
        int lastDot = path.lastIndexOf(".");

        name = path.substring(lastDash + 1,lastDot);
        extension = path.substring(lastDot + 1);
        System.out.printf("File name: %s\nFile extension: %s",name,extension);
    }
}
