package JavaFundamentalsExe;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(in.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(in.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());


        boolean check = false;



       for (int i = 0; i < deck1.size();i++){

           if (deck2.isEmpty()){
               int sum = 0;
               for (int integer : deck1) {
                   sum += integer;
               }
               System.out.printf("First player wins! Sum: %d",sum);
               break;
           }
           if (deck1.get(i) > deck2.get(i)){
               int temp = deck2.get(i);
               deck1.add(temp);
               deck1.add(deck1.remove(i));
               deck2.remove(i);
               i -= 1;
           }else if (deck1.get(i) < deck2.get(i)){
               int temp = deck1.get(i);
               deck2.add(temp);
               deck2.add(deck2.remove(i));
               deck1.remove(i);
               i -= 1;
           }else if (deck1.get(i)>=deck2.get(i)){
               deck1.remove(i);
               deck2.remove(i);
               i -= 1;
           }

           if (deck1.isEmpty()){
               check = true;
               break;
           }
        }


       if(check){
           int sum = 0;
           for (int integer : deck2) {
               sum += integer;
           }
           System.out.printf("Second player wins! Sum: %d",sum);
       }
    }

}

