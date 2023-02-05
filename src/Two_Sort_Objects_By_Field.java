import java.util.*;

class Student {
    private int roll;
    private String name;
    
    public Student(int r, String n) {
        this.roll = r;
        this.name = n;
    }

    public int getRoll() {
        return this.roll;        
    }

    public String getName() {
        return this.name;
    }
}

class ComparatorImpl implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getRoll() - s1.getRoll();
    }
}

public class Two_Sort_Objects_By_Field {
    public static void start() {
        System.out.println("\nInside Tength Module");
        Student s1 = new Student(10, "A");
        Student s3 = new Student(30, "C");
        Student s2 = new Student(20, "B");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s3);
        students.add(s2);

        System.out.println("Before Sorting");
        students.forEach(student -> 
            System.out.println(student.getName() + " " +  student.getRoll())
        );

        Collections.sort(students, new ComparatorImpl());

        System.out.println("After Sorting");
        students.forEach(student -> 
        System.out.println(student.getName() + " " +  student.getRoll())
        );
    }
}