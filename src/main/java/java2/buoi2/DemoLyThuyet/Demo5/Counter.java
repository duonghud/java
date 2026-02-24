package java2.buoi2.DemoLyThuyet.Demo5;

public class Counter {
    private static int counter = 0;
    private int nonStaticCounter = 0;
    public Counter(){
        counter++;
        nonStaticCounter++;
    }

    public int getCounter(){
        return counter;
    }

    public int getNonStaticCounter(){
        return nonStaticCounter;
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }
}

