package JavaFundamentalsExe;


import java.util.*;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] arr = in.nextLine().split(" ");
        for (int i = 0; i < arr.length;i++){
            numbers.add(Integer.parseInt(arr[i]));
        }

        String[] specialNumbers = in.nextLine().split(" ");
        int bomb = Integer.parseInt(specialNumbers[0]);
        int power = Integer.parseInt(specialNumbers[1]);

        while (numbers.contains(bomb)) {

            int index = numbers.indexOf(bomb);

            int left = Math.max(0,index - power);
            int right = Math.min(index + power, numbers.size()-1);

            for (int i = right; i >= left;i--){
                numbers.remove(i);
            }
        }



        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}
