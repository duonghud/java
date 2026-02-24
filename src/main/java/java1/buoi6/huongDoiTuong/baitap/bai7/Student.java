package java1.buoi6.huongDoiTuong.baitap.bai7;

public class Student {
    public String  name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Phương thức in thông tin sinh viên
    public void display() {
        System.out.println("Tên: " + name + " | Tuổi: " + age + " | Điểm: " + score);
    }
}
