package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap do cao cua tam giac: ");
        int h = in.nextInt();

        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++)
                System.out.print("\t");
            for (int j = 1; j <= 2*i - 1; j++) {
                if(j == 1 | j == 2*i-1 | i == h)
                    System.out.print("*");
                System.out.print("\t");
            }


            System.out.println("");
        }
    }
}
