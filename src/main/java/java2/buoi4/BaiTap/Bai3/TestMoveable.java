package java2.buoi4.BaiTap.Bai3;

public class TestMoveable {
    public static void main(String[] args) {
        MoveablePonit p = new MoveablePonit(2, 3, 1, 1);
        MoveableCircle c = new MoveableCircle(5, p);

        System.out.println(c);
        c.moveRight();
        c.moveUp();
        System.out.println(c);
    }
}

