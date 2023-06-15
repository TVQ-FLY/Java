package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai1 {
    public static int tong(int n) {
        if(n == 1) return 1;
        else return n + tong(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }while (n<=3 | n>=50);



        System.out.println("tong:" +tong(n));
    }
}
