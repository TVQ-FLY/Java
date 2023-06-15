package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();

        int tong = 0;
        int tich = 1;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                tong += i;
                tich *= i;
            }
        }
        System.out.println("Tong: " +tong+ ", Tich: " +tich);
    }


}
