package BaiThucHanhTuan2;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = in.nextInt();
        int cout = 0;
        int cout_pos = 0;
        int cout_neg = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                cout += 1;
                if((n/i)%2 == 0) cout_pos++;
                else cout_neg++;
            }
        }
        System.out.println("So luong uoc so: " +cout+ "\nChan: " +cout_pos+ ", Le: " +cout_neg);
    }
}
