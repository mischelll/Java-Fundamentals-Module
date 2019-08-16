package MidExams;

import java.util.*;
import java.util.stream.Collectors;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> best = Arrays.stream(in.nextLine().split("#")).map(Integer::new).collect(Collectors.toList());
        int sum = 0;
        int length = best.size();

        for (int integer : best) {
            sum += integer;
        }

        double average = sum*1.0 / length*1.0;



        String command = in.nextLine();

        while (!command.equals("Bake It!")){
            List<Integer> batch = Arrays.stream(command.split("#")).map(Integer::new).collect(Collectors.toList());
            int sumBatch = 0;
            for (int integer : batch) {
                sumBatch += integer;
            }
            double averageBatch = sumBatch * 1.0/batch.size()*1.0;

            if (sum < sumBatch){
                best.clear();
                best.addAll(batch);
                sum = sumBatch;
                average = averageBatch;
                length = batch.size();
            }else if (sum == sumBatch){
                if (averageBatch > average){
                    best.clear();
                    best.addAll(batch);
                    sum = sumBatch;
                    average = averageBatch;
                    length = batch.size();
                }else if (average == averageBatch){
                    if (batch.size() < length){
                        best.clear();
                        best.addAll(batch);
                        sum = sumBatch;
                        average = averageBatch;
                        length = batch.size();
                    }else {

                    }
                }
            }

            command = in.nextLine();
        }
        System.out.printf("Best Batch quality: %d\n",sum);
        for (int integer : best) {
            System.out.print(integer +" ");
        }


    }
}
