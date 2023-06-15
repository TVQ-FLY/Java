package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap do cao cua tam giac: ");
        int h = in.nextInt();

        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1 | j == i | i == h) System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
