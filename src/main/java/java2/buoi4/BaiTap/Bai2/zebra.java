package java2.buoi4.BaiTap.Bai2;

public class zebra extends Animal {
    public boolean is_wild;
    public zebra(int age, String gender, boolean is_wild){
        super(age, gender);
        this.is_wild = is_wild;
    }
    public void run(){
        System.out.println("zebra is running");
    }
}
