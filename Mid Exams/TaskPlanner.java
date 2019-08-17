package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskPlanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> tasks = Arrays.stream(in.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());

        String command = in.nextLine();

        while (!command.equals("End")){
            String[] data = command.split(" ");
            String action = data[0];

            if (action.equals("Complete")){
                int index = Integer.parseInt(data[1]);

                if (index >= 0 && index < tasks.size()){
                    tasks.set(index, 0);
                }
            }else if (action.equals("Change")){
                int index = Integer.parseInt(data[1]);
                int time = Integer.parseInt(data[2]);

                if (index >= 0 && index < tasks.size()){
                    tasks.set(index, time);
                }
            }else if (action.equals("Drop")){
                int index = Integer.parseInt(data[1]);

                if (index >= 0 && index < tasks.size()){
                    tasks.set(index, -1);
                }
            }else if (data[1].equals("Completed")){
                int countCompleted = 0;
                for (int task : tasks) {
                    if (task == 0){
                        countCompleted++;
                    }
                }
                System.out.println(countCompleted);

            }else if (data[1].equals("Incomplete")){
                int countIncompleted = 0;
                for (int task : tasks) {
                    if (task >= 1 && task <= 5){
                        countIncompleted++;
                    }
                }
                System.out.println(countIncompleted);
            }else if (data[1].equals("Dropped")){
                int countDropped = 0;
                for (int task : tasks) {
                    if (task == -1){
                        countDropped++;
                    }
                }
                System.out.println(countDropped);
            }

            command = in.nextLine();
        }

        for (int task : tasks) {
            if (task >= 1 && task <= 5){
                System.out.print(task +" ");
            }

        }


     }
}
