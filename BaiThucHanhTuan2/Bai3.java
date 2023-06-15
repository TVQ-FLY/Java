package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai3 {
    public static float S(float n) {
        if(n == 1) return 1;
        else return 1/n + S(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        }while(n<7);

        System.out.println("" +S(n));
    }
}
