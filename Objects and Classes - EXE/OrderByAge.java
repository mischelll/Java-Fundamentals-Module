package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrderByAge {
    static class Person{
        private String name;
        private String ID;
        private int age;

        public int getAge() {
            return age;
        }


        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " with ID: " + ID + " is " + age +" years old.";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String command = in.nextLine();

        while (!command.equals("End")){
            String[] data = command.split(" ");

            Person person = new Person(data[0],data[1],Integer.parseInt(data[2]));
            people.add(person);



            command = in.nextLine();
        }

        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        for (Person person : sorted) {
            System.out.println(person.toString());
        }

    }
}
