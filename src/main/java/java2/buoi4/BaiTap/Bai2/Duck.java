package java2.buoi4.BaiTap.Bai2;

public class Duck extends Animal{
    public String beakColr = "Yellow";

    public Duck(int age, String gender){
        super(age, gender);
    }
    public void Swim(){
        System.out.println("Duck can swim");
    }

    public void quack(){
        System.out.println("Duck can quack");
    }
}
