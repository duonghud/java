package java1.buoi6.huongDoiTuong.baitap.bai9;

public class Employee {
    int id;
    String name;
    int age;
    double salary;


    public Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("id" + this.id);
        System.out.println("Name" + this.name);
        System.out.println("Age" + age);
        System.out.println("Salary" + salary);
    }

    public void increaseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        }
    }

}
