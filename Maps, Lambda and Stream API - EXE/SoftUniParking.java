package JavaFundamentalsExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, String> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(in.nextLine());


        while (n > 0){
            String[] data = in.nextLine().split(" ");
            String action = data[0];

            if (action.equals("register")){
                String name = data[1];
                String plate = data[2];

                if (cars.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s\n", cars.get(name));
                }else {
                    cars.put(name,plate);
                    System.out.printf("%s registered %s successfully\n", name,plate);
                }


            }else if (action.equals("unregister")){
                String name = data[1];
                if (!cars.containsKey(name)){
                    System.out.printf("ERROR: user %s not found\n",name);
                }else {
                    cars.remove(name);
                    System.out.printf("%s unregistered successfully\n", name);
                }
            }


            n--;
        }

        cars.entrySet().stream().forEach(e -> System.out.printf("%s => %s\n",e.getKey(),e.getValue()));

    }
}
