package java1.buoi15.baitap.bai2;

public class GraduateStudent extends Student {
    private double courseworkScore;
    private double thesisScore;

    public GraduateStudent(String studentId, String fullName,
                           double courseworkScore, double thesisScore) {
        super(studentId, fullName);
        this.courseworkScore = courseworkScore;
        this.thesisScore = thesisScore;
    }

    @Override
    public double calculateFinalScore() {
        return courseworkScore * 0.6 + thesisScore * 0.4;
    }

    @Override
    public String getClassification() {
        double score = calculateFinalScore();
        if (score >= 9.0) return "Xuất sắc";
        else if (score >= 8.0) return "Giỏi";
        else if (score >= 6.5) return "Khá";
        return "Trung bình";
    }
}

