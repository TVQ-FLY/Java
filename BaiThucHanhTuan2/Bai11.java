package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai11 {
    static int giaiThua(int num) {
        if (num == 1) return 1;
        else return num * giaiThua(num - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += giaiThua(i);
        }
        System.out.println("S = " +tong);
    }
}
