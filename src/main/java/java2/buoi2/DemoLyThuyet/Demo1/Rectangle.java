package java2.buoi2.DemoLyThuyet.Demo1;

/**
 * Over Loading
 */
public class Rectangle {
    private double width;
    private double length;
    public Rectangle(){
        this.width = 3;
        this.length = 4;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double value){
        this.width = value;
        this.length = value;
    }

    public void display(){
        System.out.println("Width: " + width + " - length: " + length);
    }

}
