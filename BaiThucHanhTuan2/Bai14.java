package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai14 {
    public static double bai14(double x, int n) {
        if(n == 1) return x;
        if(n == 2) return Math.pow(x, 3) + x;
        else return Math.pow(x,(2*n + 1)) + bai14(x, n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        int n;
        System.out.println("Nhap x: ");
        x = in.nextDouble();
        System.out.println("Nhap n: ");
        n = in.nextInt();
        //System.out.println("S = " +bai14(x, n));
        double s = 0;
        for(int i = 0; i <= n; i++) {
            s += Math.pow(x, (2*n + 1));
        }
        System.out.println("S = " +s);
    }
}
