package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai7 {
    public static double S(float n) {
        if(n == 1) return .5;
        else return n/(n+1) + S(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        System.out.println("" +S(n));
    }
}
