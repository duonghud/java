package Open.ClosedPrinciple.Vidu2;

public class MySql extends Connection {
    @Override
    public void doConnect() {
        System.out.println("Connecting to MySQL database...");
    }
}