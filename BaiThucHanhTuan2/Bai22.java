package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai22 {
    public static int lcm(int a, int b) {
        if(b == 0) return a;
        return lcm(b, a%b);
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;
            int m;
            System.out.println("Nhap n: ");
            n = in.nextInt();
            System.out.println("Nhap m: ");
            m = in.nextInt();
            System.out.println("Uoc chung lon nhat cua " + n + " va " + m + " la: " + lcm(n, m));
        }
}
