package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai8 {
    public static double S(float n) {
        if(n == 1) return .5;
        else return (2*n + 1)/(2*n + 2) + S(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        do{
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        }while (n<=5);

        System.out.println("" +S(n));
    }
}
