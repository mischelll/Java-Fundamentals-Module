package MidExams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> quests = Arrays.stream(in.nextLine().split(", ")).collect(Collectors.toList());

        String command = in.nextLine();
        while (!command.equals("Retire!")){
            String[] journal = command.split(" - ");

            String action = journal[0];

            if (action.equals("Start")){
                if (quests.contains(journal[1])){

                }else {
                    quests.add(journal[1]);
                }
            }else if (action.equals("Complete")){
                if (quests.contains(journal[1])){
                    quests.remove(journal[1]);
                }
            }else if (action.equals("Side Quest")){
                String[] sideQuest = journal[1].split(":");
                if (quests.contains(sideQuest[0])){
                    if (!(quests.contains(sideQuest[1]))){
                      int indexOfQuest = quests.indexOf(sideQuest[0]);
                      if (indexOfQuest + 1 >= quests.size()){
                          quests.add(sideQuest[1]);
                      }else {
                          quests.add(indexOfQuest+1,sideQuest[1]);
                      }
                    }
                }
            }else if (action.equals("Renew")){
                if (quests.contains(journal[1])){
                    quests.add(quests.remove(quests.indexOf(journal[1])));
                }
            }


            command = in.nextLine();
        }


        String result = String.join(", ",quests);
        System.out.println(result);


    }
}
