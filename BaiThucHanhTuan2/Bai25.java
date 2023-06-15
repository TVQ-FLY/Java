package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long yeah;
        System.out.println("Nhap nam:");
        yeah = in.nextLong();
        if(yeah % 4 == 0) System.out.println("Nam nhuan!");
        else System.out.println("Khong nhuan!");
    }


}
