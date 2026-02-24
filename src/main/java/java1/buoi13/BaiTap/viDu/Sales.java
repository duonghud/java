package java1.buoi13.BaiTap.viDu;

class Sales extends Employee implements ChamCong {
    private double[] revenueProject = {10000000, 30000000, 500000000};
    private double commission = 0.1;
    private double basicSalary = 30000000.0;
    public Sales(String name, int age){
        super(name, age);
    }

    @Override
    public double calculateSalary(){
        double commissonTotal = 0;
        for (double item: revenueProject){
            commissonTotal += (item + commission);
        }
        return this.basicSalary + commissonTotal;
    }

    @Override
    public void chamcong() {
        System.out.println("Developer chấm công bằng máy nhận diện.");
    }
}
