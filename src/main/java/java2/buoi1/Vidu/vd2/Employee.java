package java2.buoi1.Vidu.vd2;

public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        if(!name.trim().isEmpty() && name.length() > 6){
            this.name = name;
        }else {
            System.out.println("Ten khong hop le");
        }

        if(age > 0 && age < 200){
            this.age = age;
        }

    }

    public String name() {
        return name;
    }

    public int age(){
        return age;
    }

    public void setName(String name) {
        if(!name.trim().isEmpty() && name.length() > 6){
            this.name = name;
        }else {
            System.out.println("Ten khong hop le");
        }
    }

    public void setAge(int age){
        if(age > 0 && age < 200){
            this.age = age;
        } else {
            System.out.println("tuoi khong hop le");
        }
    }
}
