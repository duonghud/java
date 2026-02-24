package java1.buoi11.TinhDongGoi;

public class test {
    private int numbers;
    private int age;
    public test(int numbers, int age){
        this.numbers = numbers;
        this.age = age;
    }

    public void setNumbers(int n){
        this.numbers = n;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void printNumber(){
        System.out.println(numbers);
    }
}
