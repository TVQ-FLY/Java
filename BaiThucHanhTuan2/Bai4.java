package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai4 {
    public static double S(float n) {
        if(n == 1) return 0.5;
        else return 1/(2*n) + S(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        do{
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        }while(n<=9);

        System.out.println("" +S(n));
    }
}
