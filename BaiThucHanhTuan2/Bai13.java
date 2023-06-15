package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        int n;
        System.out.println("Nhap x: ");
        x = in.nextDouble();
        System.out.println("Nhap n: ");
        n = in.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
           s += Math.pow(x, (2*i));
        }
        System.out.println("S = " +s);
    }
}