package java1.buoi11.BaiTap.Bai1;

public class User {
    private String ten;
    private int tuoi;

    public User(String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public String getTen(){
        return this.ten;
    }

    public int getTuoi(){
        return this.tuoi;
    }
    public void setTen(String tenMoi){
        if(tenMoi != null && tenMoi.length() > 0){
            this.ten = tenMoi;
        }
        System.out.println("Ten khong hop le giu nguyen");
    }

    public void setTuoi( int tuoi){
        if(tuoi >= 1 && tuoi <= 100){
            this.tuoi = tuoi;
        }else{
            System.out.println("Tuoi khong hop le giu nguyen");
        }
    }


    public void Getter(){
        System.out.println("Ten:" + ten);
        System.out.println("Tuoi:" + tuoi);
    }
}
