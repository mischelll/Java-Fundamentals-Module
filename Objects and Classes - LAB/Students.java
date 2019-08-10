package JavaFundamnetalsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        public Student(String firstName, String lastName, String age, String city) {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Age = age;
            this.City = city;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getAge() {
            return Age;
        }

        public void setAge(String age) {
            Age = age;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }


        private String FirstName;
        private String LastName;
        private String Age;
        private String City;
    }

    static boolean doesStudentExist(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = in.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");

            String fName = input[0];
            String lastName = input[1];
            String age = input[2];
            String city = input[3];

            if (doesStudentExist(students, fName, lastName)) {
                Student student = getStudent(students, fName, lastName);
                student.setFirstName(fName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(fName, lastName, age, city);
                students.add(student);
            }

            command = in.nextLine();
        }

        String city = in.nextLine();

        for (Student student : students) {
            if (city.equals(student.getCity())) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(), student.getAge(), student.getCity());
            }
        }


    }
}
