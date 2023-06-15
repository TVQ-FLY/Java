package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        float x;
        System.out.println("Nhap x: ");
        x = nhap.nextFloat();
        System.out.println("Nhap n: ");
        n = nhap.nextInt();
        System.out.println("x^n = " +Math.pow(x,n));

    }
}
