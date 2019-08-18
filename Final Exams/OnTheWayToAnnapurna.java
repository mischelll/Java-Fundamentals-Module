package MidExams;

import java.util.*;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, List<String>> storeItems = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] data = input.split("->");
            String action = data[0];

            if (action.equals("Add")) {
                String store = data[1];
                String[] items = data[2].split(",");
                storeItems.putIfAbsent(store, new ArrayList<>());
                for (int i = 0; i < items.length; i++) {
                    storeItems.get(store).add(items[i]);
                }

            } else if (action.equals("Remove")) {
                String store = data[1];
                if (storeItems.containsKey(store)) {
                    storeItems.remove(store);
                }
            }

            input = in.nextLine();
        }
        System.out.println("Stores list:");
        storeItems.entrySet().stream().sorted((a, b) ->{
            int sort = Integer.compare(b.getValue().size(),a.getValue().size());
            if (sort == 0){
                sort = b.getKey().compareTo(a.getKey());
            }

            return sort;
        }).forEach(e -> {
            System.out.printf("%s\n",e.getKey());
            e.getValue().forEach(p -> System.out.printf("<<%s>>\n",p));
        });
    }
}
