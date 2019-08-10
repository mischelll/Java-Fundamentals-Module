package JavaFundamentalsExe;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsAgain {
    static class Student {
        private String firstName;
        private String lastName;
        private double grade;


        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ": " + grade;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Student> students = new ArrayList<>();

        while (n > 0) {
            String[] data = in.nextLine().split(" ");

            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);

            n--;
        }

        List<Student> sorted = students.stream().sorted(Comparator.comparing(Student::getGrade).reversed()).collect(Collectors.toList());


        for (Student student : sorted) {
            System.out.printf("%s %s: %.2f\n",student.firstName,student.lastName,student.grade);
        }


    }
}
