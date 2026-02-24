package java2.buoi4.BaiTap.Bai3;

public class MoveablePonit implements Moveable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MoveablePonit(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        x += ySpeed;
    }

    @Override
    public void moveDown() {
        x-= ySpeed;
    }

    @Override
    public void moveLeft() {
        y-= xSpeed;
    }

    @Override
    public void moveRight() {
        y+= xSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePonit{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
