package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Nhap phuong trinh f(x) = ax + b = 0");
        System.out.println("Nhap a: ");
        a = in.nextDouble();
        System.out.println("Nhap b: ");
        b = in.nextDouble();
        if(a == 0) System.out.println("Phuong trinh vo nghiem!");
        System.out.println("Phuong trinh co nghiem x = " +-b/a);
    }
}
