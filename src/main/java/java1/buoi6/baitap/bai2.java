//Viet 1 chuong trinh in ra cac so tu 1 den 20
//nhung bo qua (khong in)tat ca cac so chia het cho3
package java1.buoi6.baitap;

public class bai2 {
    public static void main (String[] args){
        for(int i =1; i<=20; i++){
            if(i % 3 == 0){
               continue;
            }System.out.println( i + "");
        }
    }
}
