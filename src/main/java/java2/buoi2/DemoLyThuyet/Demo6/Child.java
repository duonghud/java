package java2.buoi2.DemoLyThuyet.Demo6;

public class Child extends Parent {
    private String boat;
    public Child(String house, String car){
        super(house, car);
        this.boat = boat;
    }
    @Override
    public void display(){
        System.out.println("Child: Car = " + super.car);
    }
}
