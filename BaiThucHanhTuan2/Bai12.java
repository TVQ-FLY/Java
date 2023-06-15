package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        int n;
        System.out.println("Nhap x: ");
        x = in.nextDouble();
        System.out.println("Nhap n: ");
        n = in.nextInt();
        double s = 0;
        for (int i = n; i > 0; i--) {
            s += Math.pow(x, i);
        }
        System.out.println("S = " +s);
    }
}
