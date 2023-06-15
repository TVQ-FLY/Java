package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = in.nextInt();
        for(int i = 1; i < n; i++) {
            if(i == 7 | i == 21 | i == 41)
                continue;
            if(i % 2 != 0) System.out.print(i+ " ");
        }
    }
}
