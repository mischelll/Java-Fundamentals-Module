package JavaFundamentalsExe;

import java.util.*;

public class StrudentAcademy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(in.nextLine());

        while (n > 0){
            String name = in.nextLine();
            double grade = Double.parseDouble(in.nextLine());

            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);

            n--;
        }

        Map<String, Double> averageGrdes = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if (average >= 4.50){
                averageGrdes.put(entry.getKey(),average);
            }
        }

        averageGrdes.entrySet().stream()
                .sorted((a, b) -> b.getValue(). compareTo(a.getValue()))
                .forEach(e -> System.out.printf("%s -> %.2f\n",e.getKey(),e.getValue()));



    }
}
