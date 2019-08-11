package JavaFundamentalsExe;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, List<String>> users = new LinkedHashMap<>();

        String command = in.nextLine();

        while (!command.equals("Lumpawaroo")) {
            if (command.contains("->")) {
                String[] data = command.split(" -> ");
                String name = data[0];
                String side = data[1];
                boolean present = false;
                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(name) && !entry.getKey().equals(side)) {
                        entry.getValue().remove(name);
                        users.putIfAbsent(side,new ArrayList<>());
                        users.get(side).add(name);
                        present = true;

                        break;
                    }
                }
                if (!present) {
                    users.putIfAbsent(side,new ArrayList<>());
                    users.get(side).add(name);

                }
                System.out.printf("%s joins the %s side!\n", name, side);


            } else if (command.contains("|")) {
                String[] data = command.split(" \\| ");
                String side = data[0];
                String name = data[1];

                users.putIfAbsent(side, new ArrayList<>());
                boolean isPresent = false;
                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(name)){
                        isPresent = true;
                    }
                }

                if (!users.get(side).contains(name) && !isPresent) {
                    users.get(side).add(name);
                }
            }

            command = in.nextLine();
        }

        users.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue().size(), a.getValue().size());

            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(e -> {
            if (e.getValue().size() > 0){
                System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
            }

            e.getValue().stream().sorted((a, b) -> {
                return a.compareTo(b);
            }).forEach(p -> System.out.println("! " + p));
        });
    }
}
