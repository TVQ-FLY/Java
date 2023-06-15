package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai19 {
    public static boolean check(int n) {
        if(n <= 2) return false;
        for(int i = 2; i < n/2; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = in.nextInt();
        if(check(n)) System.out.println("True!");
        else System.out.println("NOT True!");

    }
}
