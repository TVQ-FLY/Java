package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Nhap phuong trinh f(x) = ax2 + bx + c = 0");
        System.out.println("Nhap a: ");
        a = in.nextDouble();
        System.out.println("Nhap b: ");
        b = in.nextDouble();
        System.out.println("Nhap c: ");
        c = in.nextDouble();
        if(a == 0) System.out.println("Phuong trinh co nghiem x = " +-c/b);
        double  delta = b*b - 4* a * c;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem!");
        else if (delta == 0) System.out.println("Phuong trinh co nghiem kep x1 = x2 = " +-b/(2*a));
        else System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " +(-b-Math.sqrt(delta))/(2*a)+ ", x2 = " +(-b+Math.sqrt(delta))/(2*a));
    }
}
