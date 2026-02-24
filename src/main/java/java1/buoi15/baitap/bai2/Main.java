package java1.buoi15.baitap.bai2;

public class Main {
        public static void main(String[] args) {
            Student[] students = new Student[5];

            students[0] = new UndergraduateStudent("U001", "Nguyen A", 3.4, 1);
            students[1] = new UndergraduateStudent("U002", "Tran B", 3.8, 1);
            students[2] = new GraduateStudent("G001", "Pham C", 8.5, 9.0);
            students[3] = new GraduateStudent("G002", "Hoang D", 7.0, 8.0);
            students[4] = new UndergraduateStudent("U003", "Le E", 2.5, 0);

            System.out.println("=== Danh sách sinh viên ===");
            for (Student s : students) {
                s.displaySummary();
                System.out.println("Final Score: " + s.calculateFinalScore());
                System.out.println("Classification: " + s.getClassification());
                System.out.println("-----------------------------");
            }

            System.out.println("=== Sinh viên xếp loại Xuất sắc ===");
            for (Student s : students) {
                if (s.getClassification().equals("Xuất sắc")) {
                    s.displaySummary();
                }
            }
        }
    }
