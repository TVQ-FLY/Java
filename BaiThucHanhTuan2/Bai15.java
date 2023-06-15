package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai15 {
    public static int giaiThua(int n) {
        if(n == 1) return 1;
        else return n * giaiThua(n- 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();
        System.out.println("S = " +giaiThua(n));
    }
}
