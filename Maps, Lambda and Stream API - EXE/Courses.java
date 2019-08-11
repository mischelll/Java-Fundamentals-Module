package JavaFundamentalsExe;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, List<String>> students = new LinkedHashMap<>();


        String input = in.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];

            if (students.containsKey(course)) {
                students.get(course).add(name);


            } else {
                students.put(course, new ArrayList<>());
                students.get(course).add(name);

            }
            Collections.sort(students.get(course));

            input = in.nextLine();
        }

        students.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(e ->{
                    String value = String.join("\n-- ",e.getValue());
                    System.out.printf("%s: %d\n",e.getKey(),e.getValue().size());
                    System.out.printf("-- %s\n",value);
                });


        }
    }

