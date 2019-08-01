package JavaFundamentalsExe;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        lastDigit(number);
    }

    public static void  lastDigit(String number){
        long lastDigit = 0;
        String digit = "";

        for(int i = 0; i < number.length();i++){
            lastDigit = number.charAt(number.length()-1) - '0';
        }
      /*  switch (lastDigit){
            case 1:
                digit = "one";
                break;
            case 2:
                digit = "two";
                break;
            case 3:
                digit = "three";
                break;
            case 4:
                digit = "four";
                break;
            case 5:
                digit = "five";
                break;
            case 6:
                digit = "six";
                break;
            case 7:
                digit = "seven";
                break;
            case 8:
                digit = "eight";
                break;
            case 9:
                digit = "nine";
                break;
            case 0:
                digit = "ten";
                break;
                }
        */
      if (lastDigit == 1){
          digit = "one";
      }else if (lastDigit == 2){
          digit = "two";
      }else if (lastDigit == 3){
          digit = "three";
      }else if (lastDigit == 4){
          digit = "four";
      }else if (lastDigit == 5){
          digit = "five";
      }else if (lastDigit == 6){
          digit = "six";
      }else if (lastDigit == 7){
          digit = "seven";
      }else if (lastDigit == 8){
          digit = "eight";
      }else if (lastDigit == 9){
          digit = "nine";
      }else if (lastDigit == 0){
          digit = "zero";
      }
      System.out.println(digit);
    }


    }


