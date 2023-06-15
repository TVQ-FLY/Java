package BaiThucHanhTuan2;

public class Bai34 {
    public static class hocSinh {
        private String maHS;
        private String tenHs;
        private double diemToan, diemLy, diemHoa;

        hocSinh() {
            maHS = "";
            tenHs = "";
            diemToan = 0;
            diemLy = 0;
            diemHoa = 0;
        }

        hocSinh(String maHS, String tenHs, double diemToan, double diemLy, double diemHoa) {
            this.maHS = maHS;
            this.tenHs = tenHs;
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;
        }
        double diemTB() {
            return (diemToan + diemLy + diemHoa) / 3;
        }
        String xepLoai() {
            String xl = "";
            if(diemTB() < 5) xl = "Yeu";
            if(diemTB() >= 5 & diemTB() < 6.5) xl = "Trung binh";
            if(diemTB() >= 6.5 & diemTB() < 8) xl = "Kha";
            if(diemTB() >= 8) xl = "Gioi";
            return xl;
        }

    }
    public static void main(String[] args) {
        hocSinh hs = new hocSinh("242", "Hoang Ngoc Giang", 9.2, 8.6, 8.5);
        System.out.println(hs.diemTB());
        System.out.println(hs.xepLoai());
    }
}
