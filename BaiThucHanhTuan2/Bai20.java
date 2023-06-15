package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai20 {
    public static boolean check(int n) {
        int i = (int) Math.sqrt(n);
        if(i*i == n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap n: ");
            n = in.nextInt();
        }while(n <= 0);
        if(check(n)) System.out.println("True");
        else System.out.println("False");
    }


}
