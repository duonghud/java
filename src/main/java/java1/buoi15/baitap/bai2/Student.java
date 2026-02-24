package java1.buoi15.baitap.bai2;

import java.awt.*;

public abstract class Student {
    protected String studentId;
    protected String fullName;

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public abstract double calculateFinalScore();
    public abstract String getClassification();

    public void displaySummary() {
        System.out.println("ID: " + studentId + " - Name: " + fullName);
    }
}

