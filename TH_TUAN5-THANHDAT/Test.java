public class Test {
    public static void main(String[] args) {
        // Tao sach bang constructor
        sach sach1 = new sach("B001", "Lap trinh Java", "Nguyen Van A", 2022, 10);

        // Tao sach bang setter
        sach sach2 = new sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cau truc du lieu");
        sach2.setTacGia("Tran Van B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);
        
        // Hien thi thong tin
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}