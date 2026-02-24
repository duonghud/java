package java2.buoi4.BaiTap.Bai2;

public class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal(){
        return false;
    }

    public void mate(){
        System.out.println("animal is mating");
    }
}
