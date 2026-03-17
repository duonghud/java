package Open.ClosedPrinciple.Vidu2;

public class App {
    public static void main(String[] args) {
        Connection sql = new SqlServer();
        Connection mysql = new MySql();
        ConnectionManager manager = new ConnectionManager();
        manager.doConnect(sql);
        manager.doConnect(mysql);
        System.out.println("Connect to MongGoDb");
        Connection MongGoDb = new MongGoDb();
        manager.doConnect(MongGoDb);
    }
}
