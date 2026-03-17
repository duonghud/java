package Open.ClosedPrinciple.Vidu1;

public class PerformanceBonus implements Bonus {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.01;
    }
}
