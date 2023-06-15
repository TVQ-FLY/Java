package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap m: ");
        int m = in.nextInt();
        System.out.println("Nhap b: ");
        int n = in.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
