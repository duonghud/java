package java1.buoi13.BaiTap.viDu;

public abstract class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    //Phương thức calculateSalary() là phương thức trừu tượng => không có thân hàm (không triển khai)
    public abstract double calculateSalary();
}
