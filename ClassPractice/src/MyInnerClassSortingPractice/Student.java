package MyInnerClassSortingPractice;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            // o1.name.compareTo(o2.name)
            return Double.compare(o1.gpa, o2.gpa);
        }
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Gpa=" + gpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 3.5);
        Student s2 = new Student("Bob", 2.5);
        Student s3 = new Student("Carl", 1.5);

        Student[] students = {s1, s3, s2};
        System.out.println("Before sort" + Arrays.toString(students));
        Arrays.sort(students, s1.getStudentComparator());
        System.out.println("After sort" + Arrays.toString(students));

    }

    public StudentComparator getStudentComparator() {
        return new StudentComparator();
    }
}
