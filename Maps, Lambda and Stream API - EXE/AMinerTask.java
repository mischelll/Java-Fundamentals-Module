package JavaFundamentalsExe;

import java.util.*;
import java.util.stream.Collectors;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Long> resources = new LinkedHashMap<>();

        String resource = in.nextLine();

        while (!resource.equals("stop")){
            long quantity = Long.parseLong(in.nextLine());

            resources.putIfAbsent(resource,0L);
            resources.put(resource,resources.get(resource) + quantity);

            resource = in.nextLine();
        }

        for (Map.Entry<String, Long> entry : resources.entrySet()) {
            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }


    }
}
