package solidSRP.vidu2.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String name, int age, List<Integer> grade) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double calculateAverage(){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum/grades.size();
    }

    public void saveToDatabase(){
        System.out.println("Luu thanh cong");
    }

    public void generateReport(){
        System.out.println("Bao cao");
    }
}
