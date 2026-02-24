package java1.buoi15.baitap.bai2;

public class UndergraduateStudent extends Student {
    private double gpa;
    private int researchPoints; // tối đa 1 điểm

    public UndergraduateStudent(String studentId, String fullName, double gpa, int researchPoints) {
        super(studentId, fullName);
        this.gpa = gpa;
        this.researchPoints = Math.min(researchPoints, 1); // tránh > 1
    }

    @Override
    public double calculateFinalScore() {
        return gpa + researchPoints;
    }

    @Override
    public String getClassification() {
        double score = calculateFinalScore();
        if (score > 3.5) return "Xuất sắc";
        else if (score >= 3.0) return "Giỏi";
        else if (score >= 2.0) return "Khá";
        return "Trung bình";
    }
}

