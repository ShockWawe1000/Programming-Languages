package ex1;
import java.util.Random;

interface Average {
    float average();
}

interface Scholarship {
    float rate();
}

class Person {
    String p_name;

    public Person(String p_name) {
        this.p_name = p_name;
    }
}

class Employee extends Person implements Average {
    int no_salaries;
    int[] salary = new int[12];

    public Employee(String name, int n) {
        super(name);
        this.no_salaries = n;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            salary[i] = random.nextInt(30001);
        }
    }

    @Override
    public float average() {
        if (no_salaries == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < no_salaries; i++) {
                sum += salary[i];
            }
            return (float) sum / no_salaries;
        }
    }
}

class Student extends Person implements Average, Scholarship {
    int no_grades;
    Employee parent1;
    Employee parent2;
    int[] grade = new int[6];

    public Student(String name, int n, Employee r1, Employee r2) {
        super(name);
        this.no_grades = n;
        this.parent1 = r1;
        this.parent2 = r2;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            grade[i] = random.nextInt(6) + 5;
        }
    }

    @Override
    public float average() {
        int sum = 0;
        for (int i = 0; i < no_grades; i++) {
            sum += grade[i];
        }
        return (float) sum / no_grades;
    }

    @Override
    public float rate() {
        float gpa = average();
        float parentSalarySum = parent1.average() + parent2.average();
        return gpa * 6 + (60000 - parentSalarySum) * 4;
    }
}

public class ex1 {  
    public static void main(String[] args) {  
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Ana", 4);
        employees[1] = new Employee("Maja", 3);
        employees[2] = new Employee("Murat", 0);
        employees[3] = new Employee("Ema", 2);
        employees[4] = new Employee("David", 0);
        employees[5] = new Employee("Stefan", 5);

        Student[] students = new Student[3];
        students[0] = new Student("Nikola", 4, employees[0], employees[1]);
        students[1] = new Student("Sofija", 5, employees[2], employees[3]);
        students[2] = new Student("Oliver", 3, employees[4], employees[5]);

        Student scholarshipRecipient = null;
        float maxPoints = Integer.MIN_VALUE;

        for (Student student : students) {
            float points = student.rate();
            System.out.println("Student: " + student.p_name);
            System.out.println("GPA: " + student.average());
            System.out.println("Parent 1: " + student.parent1.p_name + ", Average Salary: " + student.parent1.average());
            System.out.println("Parent 2: " + student.parent2.p_name + ", Average Salary: " + student.parent2.average());
            System.out.println("Scholarship Points: " + points);
            System.out.println();

            if (points > maxPoints) {
                maxPoints = points;
                scholarshipRecipient = student;
            }
        }

        System.out.println("The student who will get the scholarship is: " + scholarshipRecipient.p_name);
    }  
}
