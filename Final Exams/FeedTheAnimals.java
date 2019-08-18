package MidExams;

import java.util.*;

public class FeedTheAnimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, Integer> animalFood = new LinkedHashMap<>();
        Map<String, List<String>> areaAnimal = new LinkedHashMap<>();

        while (!input.equals("Last Info")) {
            String[] data = input.split(":");
            String action = data[0];

            if (action.equals("Add")){
                animalFood.putIfAbsent(data[1],0);
                animalFood.put(data[1],animalFood.get(data[1]) + Integer.parseInt(data[2]));

                areaAnimal.putIfAbsent(data[3], new ArrayList<>());
                if (!areaAnimal.get(data[3]).contains(data[1])){
                    areaAnimal.get(data[3]).add(data[1]);
                }

            }else if (action.equals("Feed")){
                String name = data[1];
                int food = Integer.parseInt(data[2]);
                String area = data[3];

                if (animalFood.containsKey(name)){
                    animalFood.put(name,animalFood.get(name) - food);
                    if (animalFood.get(name) <= 0){
                        System.out.printf("%s was successfully fed\n",name);
                        animalFood.remove(name);
                        areaAnimal.get(area).remove(name);
                        if (areaAnimal.get(area).isEmpty()){
                            areaAnimal.remove(area);
                        }
                    }
                }
            }

            input = in.nextLine();
        }

        System.out.println("Animals:");
        animalFood.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(e -> System.out.printf("%s -> %dg\n",e.getKey(),e.getValue()));

        System.out.println("Areas with hungry animals:");
        areaAnimal.entrySet()
                .stream()
                .sorted((a,b) -> Integer.compare(b.getValue().size(),a.getValue().size()))
                .forEach(e -> System.out.printf("%s : %d\n",e.getKey(),e.getValue().size()));
    }
}
