package BaiThucHanhTuan2;

import java.time.Year;
import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String name = in.nextLine();
        System.out.println("Nam sinh: ");
        long birth = in.nextLong();
        long nam = Year.now().getValue();
        System.out.println(nam-birth+ " tuoi");
    }
}
