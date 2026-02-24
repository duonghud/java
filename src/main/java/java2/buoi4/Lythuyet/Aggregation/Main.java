package java2.buoi4.Lythuyet.Aggregation;

public class Main {
    public static void main(String[] args) {
        Products p = new Products("hups", 1000);
        Catalogs c = new Catalogs("m");
        c.addProduct(p);
    }
}
