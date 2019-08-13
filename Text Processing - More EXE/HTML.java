package JavaFundamentalsExe;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        String article = in.nextLine();

        System.out.printf("<h1>\n    %s\n</h1>\n",title);
        System.out.printf("<article>\n    %s\n</article>\n",article);

        String comment = in.nextLine();
        while (!comment.equals("end of comments")){

            System.out.printf("<div>\n    %s\n</div>\n",comment);


            comment = in.nextLine();
        }
    }
}
