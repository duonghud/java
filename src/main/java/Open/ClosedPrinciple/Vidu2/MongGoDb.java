package Open.ClosedPrinciple.Vidu2;

public class MongGoDb extends Connection {

    @Override
    public void doConnect() {
        System.out.println("Connecting to MongGoDb database .....");
    }
}
