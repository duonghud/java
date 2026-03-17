package Open.ClosedPrinciple.Vidu1;

public class App {
    public static void main(String[] args) {
        Bonus salesBonus = new SalesBonus();
        Bonus performanceBonus = new PerformanceBonus();

        double salary = 1000;

        System.out.println("Sales Bonus: " + salesBonus.calculateBonus(salary));
        System.out.println("Performance Bonus: " + performanceBonus.calculateBonus(salary));
    }
}