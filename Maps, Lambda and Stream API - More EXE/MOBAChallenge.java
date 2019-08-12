package JavaFundamentalsExe;

import java.util.*;

public class MOBAChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Map<String, Integer>> playerPositionSkill = new TreeMap<>();
        Map<String, Integer> playerSkill = new TreeMap<>();

        String command = in.nextLine();

        while (!command.equals("Season end")) {
            if (command.contains(" -> ")) {
                String[] data = command.split(" -> ");
                String player = data[0];
                String position = data[1];
                int skill = Integer.parseInt(data[2]);

                playerPositionSkill.putIfAbsent(player, new HashMap<>());
                playerSkill.putIfAbsent(player, 0);

                if (playerPositionSkill.get(player).containsKey(position)) {
                    int currentSkill = playerPositionSkill.get(player).get(position);
                    boolean isBigger = currentSkill < skill;
                    int skillToAdd = 0;
                    if (isBigger) {
                        playerPositionSkill.get(player).put(position, skill);
                        skillToAdd = skill - currentSkill;
                        playerSkill.put(player, playerSkill.get(player) + skillToAdd);
                    }
                } else {
                    playerPositionSkill.get(player).put(position, skill);
                    playerSkill.put(player, playerSkill.get(player) + skill);
                }

            } else if (command.contains(" vs ")) {
                String[] data = command.split(" vs ");
                String player1 = data[0];
                String player2 = data[1];
                if (playerPositionSkill.containsKey(player1) && playerPositionSkill.containsKey(player2)) {

                    Map<String, Integer> positionSkill1 = playerPositionSkill.get(player1);
                    Map<String, Integer> positionSkill2 = playerPositionSkill.get(player2);

                    for (Map.Entry<String, Integer> entry : positionSkill1.entrySet()) {
                        String toCompare = entry.getKey();
                        int skilToCompare = entry.getValue();
                        for (Map.Entry<String, Integer> entry2 : positionSkill2.entrySet()) {
                            if (entry2.getKey().equals(toCompare)) {
                                if (entry2.getValue() < skilToCompare) {
                                    playerPositionSkill.remove(player2);
                                    playerSkill.remove(player2);
                                    break;

                                } else if (entry2.getValue() > skilToCompare) {
                                    playerPositionSkill.remove(player1);
                                    playerSkill.remove(player1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            command = in.nextLine();
        }

        playerSkill.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%s: %d skill\n",e.getKey(),e.getValue());
            playerPositionSkill.entrySet().forEach(p -> {
                if (e.getKey().equals(p.getKey())){
                    p.getValue().entrySet().stream().sorted((a,b) ->{
                        int sort =  Integer.compare(b.getValue(),a.getValue());
                        if (sort==0){
                            sort = a.getKey().compareTo(b.getKey());
                        }
                        return sort;
                    }).forEach(w -> System.out.printf("- %s <::> %d\n",w.getKey(),w.getValue()));
                }
            });
        });




    }
}

