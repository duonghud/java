package java2.buoi2.DemoLyThuyet.Demo3;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db);
        System.out.println(db1);
        System.out.println(db2);
    }
}
