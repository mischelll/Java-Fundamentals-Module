package JavaFundamentalsExe;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, List<String>> companies = new TreeMap<>();

        String command = in.nextLine();

        while (!command.equals("End")){
            String[] data = command.split(" -> ");
            String name = data[0];
            String ID = data[1];

            companies.putIfAbsent(name,new ArrayList<>());
            if (!companies.get(name).contains(ID)){
                companies.get(name).add(ID);
            }


            command = in.nextLine();
        }

        companies.entrySet().stream().forEach(e -> System.out.printf("%s\n-- %s\n",e.getKey(),String.join("\n-- ",e.getValue())));
    }
}
