package JavaFundamentalsExe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lessons = Arrays.stream(in.nextLine().split(", ")).collect(Collectors.toList());

        String command = in.nextLine();
        while (!command.equals("course start")){
            String[] input = command.split(":");
            String action = input[0];

            if (action.equals("Add")){
                if (lessons.contains(input[1])){

                }else {
                    lessons.add(input[1]);
                }
            }else if (action.equals("Insert")){
                if (lessons.contains(input[1])){

                }else {
                    lessons.add(Integer.parseInt(input[2]),input[1]);
                }
            }else if (action.equals("Remove")){
                if (lessons.contains(input[1])){
                    lessons.remove(input[1]);

                    String exerciseOfLesson = input[1] + "-Exercise";
                    if (lessons.contains(exerciseOfLesson)){
                        lessons.remove(exerciseOfLesson);
                    }
                }


            }else if (action.equals("Exercise")){
                String exercise = input[1] + "-" + input[0];
                if (lessons.contains(input[1]) && lessons.contains(exercise)){

                }else{
                    if (lessons.contains(input[1])){
                        int index = lessons.indexOf(input[1]);
                        if (index + 1 >= lessons.size()){
                            lessons.add(exercise);
                        }else {
                            lessons.add(index+1,exercise);

                        }
                    }else {
                        lessons.add(input[1]);
                        lessons.add(exercise);

                    }
                }



            }else if (action.equals("Swap")){
                String lesson1 = input[1];
                String lesson2 = input[2];

                if (lessons.contains(lesson1) && lessons.contains(lesson2)){
                    int indexOfLesson1 = lessons.indexOf(lesson1);
                    int indexOfLesson2 = lessons.indexOf(lesson2);

                    Collections.swap(lessons,indexOfLesson1,indexOfLesson2);

                    int newIndexOfLesson1 = lessons.indexOf(lesson1);
                    int newIndexOfLesson2 = lessons.indexOf(lesson2);

                    String exerciseOfLesson1 = lesson1 + "-Exercise";
                    String exerciseOfLesson2 = lesson2 + "-Exercise";


                    if (lessons.contains(exerciseOfLesson1)) {


                        if (newIndexOfLesson1+1 >= lessons.size()){
                            lessons.remove(exerciseOfLesson1);
                            lessons.add(exerciseOfLesson1);
                        }else {
                            lessons.remove(exerciseOfLesson1);
                            lessons.add(newIndexOfLesson1+1,exerciseOfLesson1);
                        }

                    }
                    if (lessons.contains(exerciseOfLesson2)){


                        if (newIndexOfLesson2+1 >= lessons.size()){
                            lessons.remove(exerciseOfLesson2);
                            lessons.add(exerciseOfLesson2);
                        }else {
                            lessons.remove(exerciseOfLesson2);
                            lessons.add(newIndexOfLesson2+1,exerciseOfLesson2);
                        }
                    }

                }
            }
            command = in.nextLine();
        }

        int position = 1;
        for (String lesson : lessons) {
            System.out.printf("%d.%s\n",position,lesson);
            position++;
        }

    }
}
