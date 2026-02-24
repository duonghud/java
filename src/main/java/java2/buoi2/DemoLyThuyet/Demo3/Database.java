package java2.buoi2.DemoLyThuyet.Demo3;

public class Database {
    private static Database instance;
    private Database(){
        System.out.println("Contructor");
    }

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
}
