package java2.buoi4.BaiTap.Bai3;

public class MoveableCircle implements Moveable{
    public int radius;
    public MoveablePonit center;

    public MoveableCircle(int radius, MoveablePonit moveablePonit) {
        this.center = moveablePonit;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
