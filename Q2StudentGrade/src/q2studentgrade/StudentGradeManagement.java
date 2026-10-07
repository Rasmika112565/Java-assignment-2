import java.util.*;

public class StudentGradeManagement {

    static class Student {

        int id;
        String name;
        double mark;

        Student(int id, String name, double mark) {
            this.id = id;
            this.name = name;
            this.mark = mark;
        }

        String getGrade() {

            if (mark >= 90) {
                return "A";
            } else if (mark >= 80) {
                return "B";
            } else if (mark >= 70) {
                return "C";
            } else if (mark >= 60) {
                return "D";
            } else {
                return "F";
            }
        }

        public String toString() {
            return id + " - " + name
                    + " - Mark: " + mark
                    + " - Grade: " + getGrade();
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Arun", 85));
        students.add(new Student(102, "Priya", 92));
        students.add(new Student(103, "Kavin", 76));
        students.add(new Student(104, "Divya", 65));

        System.out.println("----- STUDENT LIST -----");

        for (Student s : students) {
            System.out.println(s);
        }

        Set<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Java");

        System.out.println("\n----- COURSES -----");

        for (String course : courses) {
            System.out.println(course);
        }

        Map<Integer, String> studentNames = new HashMap<>();

        for (Student s : students) {
            studentNames.put(s.id, s.name);
        }

        System.out.println("\n----- STUDENT MAP -----");

        for (Map.Entry<Integer, String> entry : studentNames.entrySet()) {
            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }

        Queue<String> resultQueue = new LinkedList<>();

        resultQueue.add("Arun");
        resultQueue.add("Priya");
        resultQueue.add("Kavin");
        resultQueue.add("Divya");

        System.out.println("\n----- RESULT PROCESSING -----");

        while (!resultQueue.isEmpty()) {

            String student = resultQueue.poll();

            System.out.println(
                    "Processing result for: " + student);
        }
    }
}