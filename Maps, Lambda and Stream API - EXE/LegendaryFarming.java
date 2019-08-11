package JavaFundamentalsExe;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> material = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        material.put("shards",0);
        material.put("motes",0);
        material.put("fragments",0);

        String input = in.nextLine();
        boolean shadowObtained = false;
        boolean valanyrObtained = false;
        boolean dragonObtained = false;



        while (true) {
            String[] data = input.toLowerCase().split(" ");

            for (int i = 0; i < data.length; i += 2) {
                String stuff = data[i + 1];
                int quantity = Integer.parseInt(data[i]);

                if (stuff.equals("shards")) {
                    material.put(stuff,material.get(stuff) + quantity);
                    if (material.get(stuff) >= 250) {
                        material.put(stuff, material.get(stuff) - 250);
                        shadowObtained = true;
                        break;
                    }
                } else if (stuff.equals("fragments")) {
                    material.put(stuff,material.get(stuff) + quantity);
                    if (material.get(stuff) >= 250) {
                        material.put(stuff, material.get(stuff) - 250);
                        valanyrObtained = true;
                        break;

                    }
                } else if (stuff.equals("motes")) {
                    material.put(stuff,material.get(stuff) + quantity);
                    if (material.get(stuff) >= 250) {
                        material.put(stuff, material.get(stuff) - 250);
                        dragonObtained = true;
                        break;
                    }
                } else {
                    junk.putIfAbsent(stuff, 0);
                    junk.put(stuff,junk.get(stuff) + quantity);
                }


            }
            if (shadowObtained) {
                System.out.println("Shadowmourne obtained!");
                break;
            } else if (dragonObtained) {
                System.out.println("Dragonwrath obtained!");
                break;
            } else if (valanyrObtained) {
                System.out.println("Valanyr obtained!");
                break;
            }

            input = in.nextLine();

        }
        material.entrySet().stream().sorted((a,b) -> {
            if (a.getValue() == b.getValue()){
                return a.getKey().compareTo(b.getKey());
            }else {
                return b.getValue().compareTo(a.getValue());
            }
        }).forEach(e -> System.out.printf("%s: %d\n", e.getKey(),e.getValue()));

        junk.entrySet().stream().forEach(e -> System.out.printf("%s: %d\n", e.getKey(),e.getValue()));

        }
    }
