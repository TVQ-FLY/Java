package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai9 {
    public static int S(int n) {
        if(n == 1) return 1;
        else return n * S(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        do{
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        }while (n<=6);

        System.out.println("" +S(n));
    }
}
