package java1.buoi3.mang1chieu;

public class Main {
   public static void main(String[] args) {
       /**
    Main là một kiểu dữ liệu đặc biệt.
    Bao gồm các phần tử có cùng kiểu dữ liệu và được sắp xếp liên tiếp nhau trong bộ nhớ
    Cấu trúc của mảng bao gồm:
    Phần tử( thành phần dữ liệu)
    Chỉ số mảng: Là các số nguyên tố từ 0 đến n-1 (với n là số lượng phần tử trong mảng)
    Đặt tên mảng : Giống như quy tắc đặt tên biến thông thường
    Kích thước của mản không thay đổi trong quá trình biên dịch
        */
       // khai báo mảng:
       int[] number; // khai báo không khởi tạo.
       int[] numbers_1 = new int[5]; // khai báo 1 mảng số nguyên có tên là numbers_1 bao gồm 5 phần tử
       int[] numbers_2 = {1,2,3,4,5}; // khai báo 1 mảng số nguyên có tên l numbers_2 bao gồm 5 phần tử có giá trị
       /**
        *Truy cập vào từng phần tử trong mảng dựa vào chỉ số index của các phần tử
        */
       System.out.println(numbers_2[0]);
       System.out.println(numbers_2[1]);
       System.out.println(numbers_2[4]);
       numbers_2[4] = 10;
       System.out.println(numbers_2[4]);
       /**
        * Bài tập 1: Nhập n phần là số nguyên vào mảng 1 chiều.
        * 1. In ra các phần tử ra màn hình
        * 2. Tính tổng
        * 3. Tính tổng các phần tử chẵn, lẻ trong mảng.
        * 4. Tìm phần lớn nhất, nhỏ nhất trong mảng.
        * 5. Đếm số lượng phần tử chẵn, lẻ trong mảng.
        * 6. Sắp xếp mảng theo chiều tăng dần.
        */
   }
}
