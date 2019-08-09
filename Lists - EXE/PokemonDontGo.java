package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(in.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());
        List<Integer> removed = new ArrayList<>();

        while (!pokemons.isEmpty()){
            int index = Integer.parseInt(in.nextLine());
            int value = 0;
            if (index >= pokemons.size()){
                value = pokemons.get(pokemons.size()-1);
                pokemons.set(pokemons.size()-1,pokemons.get(0));
                removed.add(value);
            }else if (index < 0){
                value = pokemons.get(0);
                pokemons.set(0,pokemons.get(pokemons.size()-1));
                removed.add(value);
            }else  {
                value = pokemons.get(index);
                pokemons.remove(index);
                removed.add(value);
            }

            for (int i = 0 ; i < pokemons.size();i++){


                if (pokemons.get(i) <= value){
                    pokemons.set(i,pokemons.get(i) + value);
                }else if (pokemons.get(i) > value){
                    pokemons.set(i,pokemons.get(i) - value);
                }
            }


        }
        int sum = 0;
        for (int integer : removed) {
            sum += integer;
        }
        System.out.println(sum);


    }
}
