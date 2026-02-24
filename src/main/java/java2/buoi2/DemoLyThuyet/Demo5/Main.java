package java2.buoi2.DemoLyThuyet.Demo5;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(c1.getCounter());
        System.out.println(c1.getNonStaticCounter());
        Counter.staticMethod();
        System.out.println(MathUntils.PI);
    }
}
