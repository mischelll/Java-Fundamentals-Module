package JavaFundamentalsExe;

import java.util.*;
import java.util.stream.Collectors;

public class OpinionPoll {
    static class Person{
        private String name;
        private int age;


        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<Person> aboveThirty = new ArrayList<>();

        while (n > 0){
            String[] input = in.nextLine().split(" ");

            Person person = new Person(input[0],Integer.parseInt(input[1]));

            if (person.getAge() > 30){
                aboveThirty.add(person);
            }


            n--;
        }

        List<Person> sorted = aboveThirty.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        for (Person person : sorted) {
            System.out.printf("%s - %d\n",person.name,person.age);
        }


    }
}
