package JavaFundamentalsExe;

import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(",\\s+");

        for (int i = 0; i < line.length; i++) {
            String ticket = line[i].trim();
            StringBuilder sb = new StringBuilder();

            if (ticket.length() == 20) {
                checkForWinningTicket(ticket);

            } else {
                System.out.printf("invalid ticket\n");
            }
        }

    }

    static void checkForWinningTicket(String ticket) {
        char[] toArr = ticket.toCharArray();
        char c = checkSymbol(toArr);


        int lengthLeft = 0;
        int lengthRight = 0;

        if (c == '$') {

            String leftSubstring = ticket.substring(0, ticket.length() / 2);
            int index = leftSubstring.indexOf("$");
            int lastIndex = leftSubstring.lastIndexOf("$");
            lengthLeft = leftSubstring(leftSubstring, index, lastIndex, lengthLeft, c);


            String rightSubstring = ticket.substring(10);
            int indexRight = rightSubstring.indexOf("$");
            int lastIndexRight = rightSubstring.lastIndexOf("$");
            lengthRight = rightSubstring(rightSubstring,indexRight,lastIndexRight,lengthRight,c);

        } else if (c == '@') {

            String leftSubstring = ticket.substring(0, ticket.length() / 2);
            int index = leftSubstring.indexOf("@");
            int lastIndex = leftSubstring.lastIndexOf("@");
            lengthLeft = leftSubstring(leftSubstring, index, lastIndex, lengthLeft, c);

            String rightSubstring = ticket.substring(10);
            int indexRight = rightSubstring.indexOf("@");
            int lastIndexRight = rightSubstring.lastIndexOf("@");
            lengthRight = rightSubstring(rightSubstring,indexRight,lastIndexRight,lengthRight,c);

        } else if (c == '#') {

            String leftSubstring = ticket.substring(0, ticket.length() / 2);
            int index = leftSubstring.indexOf("#");
            int lastIndex = leftSubstring.lastIndexOf("#");
            lengthLeft = leftSubstring(leftSubstring, index, lastIndex, lengthLeft, c);

            String rightSubstring = ticket.substring(10);
            int indexRight = rightSubstring.indexOf("#");
            int lastIndexRight = rightSubstring.lastIndexOf("#");
            lengthRight = rightSubstring(rightSubstring,indexRight,lastIndexRight,lengthRight,c);

        } else if (c == '^') {

            String leftSubstring = ticket.substring(0, ticket.length() / 2);
            int index = leftSubstring.indexOf("^");
            int lastIndex = leftSubstring.lastIndexOf("^");
            lengthLeft = leftSubstring(leftSubstring, index, lastIndex, lengthLeft, c);

            String rightSubstring = ticket.substring(10);
            int indexRight = rightSubstring.indexOf("^");
            int lastIndexRight = rightSubstring.lastIndexOf("^");
            lengthRight = rightSubstring(rightSubstring,indexRight,lastIndexRight,lengthRight,c);
        }

        if ((lengthLeft >= 6 && lengthLeft <= 9) || (lengthRight >= 6 && lengthRight <= 9)) {
            System.out.printf("ticket \"%s\" - %d%c\n", ticket, Math.min(lengthLeft, lengthRight), c);
        } else if (lengthLeft == 10 && lengthRight == 10) {
            System.out.printf("ticket \"%s\" - %d%c Jackpot!\n", ticket, lengthLeft, c);
        } else {
            System.out.printf("ticket \"%s\" - no match\n", ticket);
        }
    }

    static char checkSymbol(char[] arr) {
        char c = 0;
        int ch1 = 0; //@
        int ch2 = 0; //$
        int ch3 = 0; //#
        int ch4 = 0; //^

        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            if (c == '@') {
                ch1++;
            }
            if (c == '$') {
                ch2++;
            }
            if (c == '#') {
                ch3++;
            }
            if (c == '^') {
                ch4++;
            }
        }
        int split1 = Math.max(ch1, ch2);
        int split2 = Math.max(ch3, ch4);
        int biggest = Math.max(split1, split2);
        if (biggest == 0) {
            return c;
        }

        if (biggest == ch1) {
            c = '@';
        } else if (biggest == ch2) {
            c = '$';
        } else if (biggest == ch3) {
            c = '#';
        } else if (biggest == ch4) {
            c = '^';
        }


        return c;
    }

    static int leftSubstring(String leftSubstring, int index, int lastIndex, int lengthLeft, char c) {

        for (int i = index; i <= lastIndex; i++) {
            if (leftSubstring.charAt(i) == c) {
                lengthLeft++;
            } else {
                break;
            }
        }
        int lengthLeftReversed = 0;
        for (int i = lastIndex; i >= index; i--) {
            if (leftSubstring.charAt(i) == c) {
                lengthLeftReversed++;
            } else {
                break;
            }
        }
        if (lengthLeft > lengthLeftReversed) {
            return lengthLeft;

        } else if (lengthLeftReversed > lengthLeft){
            return lengthLeftReversed;
        }else {
            return lengthLeft;
        }
    }

    static int rightSubstring(String rightSubstring, int indexRight, int lastIndexRight, int lengthRight, char c) {
        for (int i = indexRight; i <= lastIndexRight; i++) {
            if (rightSubstring.charAt(i) == c) {
                lengthRight++;
            } else {
                break;
            }
        }
        int lengthRightReversed = 0;
        for (int i = lastIndexRight; i >= indexRight; i--) {
            if (rightSubstring.charAt(i) == c) {
                lengthRightReversed++;
            } else {
                break;
            }
        }
        if (lengthRight > lengthRightReversed) {
            return lengthRight;

        } else if (lengthRightReversed > lengthRight){
            return lengthRightReversed;
        }else {
            return lengthRight;
        }
    }

}

