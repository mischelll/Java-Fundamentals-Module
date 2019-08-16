package MidExams;

import java.util.Scanner;

public class DarkestDungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int initalHealth = 100;
        int initialCoins = 0;
        int rooms = 0;
        boolean dead = false;
        String killer = "";

        String line = in.nextLine();
        String newLine = line.replaceAll("\\W", " ");
        String[] arr = newLine.split(" ");
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0){
                rooms++;
                if (arr[i].equals("potion")){
                    int poiton = Integer.parseInt(arr[i + 1]);
                    initalHealth += poiton;
                    if (initalHealth > 100){
                        int useless = initalHealth - 100;
                        poiton -= useless;
                        initalHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.\nCurrent health: %d hp.\n",poiton,initalHealth);
                }else if(arr[i].equals("chest")){
                    int coins = Integer.parseInt(arr[i+1]);
                    initialCoins += coins;
                    System.out.printf("You found %d coins.\n",coins);
                }else {

                    int damage = Integer.parseInt(arr[i + 1]);
                    if (initalHealth > 0){
                        initalHealth -= damage;
                        if (initalHealth <= 0){
                            killer = arr[i];
                            dead = true;
                            break;
                        }
                        System.out.printf("You slayed %s.\n",arr[i]);
                    }else {
                        dead = true;
                        break;
                    }


                }
            }
        }
        if (dead){
            System.out.printf("You died! Killed by %s.\nBest room: %d",killer,rooms);
        }else {
            System.out.printf("You've made it!\nCoins: %d\nHealth: %d",initialCoins,initalHealth);
        }
    }
}
