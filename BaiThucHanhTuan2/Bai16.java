package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n :");
        n = in.nextInt();

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) System.out.print(i+" ");
        }
    }
}
