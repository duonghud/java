package java2.buoi4.BaiTap.Bai2;

public class Fish extends Animal{
    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public void Swim(){
        System.out.println("Fish is swimming");
    }
}
