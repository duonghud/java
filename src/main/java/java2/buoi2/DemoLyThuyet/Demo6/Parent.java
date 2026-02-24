package java2.buoi2.DemoLyThuyet.Demo6;

public class Parent {
    private String house;
    protected String car;

    public Parent (String car, String house) {
        this.car = car;
        this.house = house;
    }

    public void display(){
        System.out.println("parent: house = " + house + "| car = " + car);
    }
}
