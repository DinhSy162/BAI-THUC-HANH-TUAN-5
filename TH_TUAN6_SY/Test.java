
public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Them sach giao trinh
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2023, 10, "CNTT", "Dai hoc");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Cau truc du lieu", "Tran Van B", 2022, 5, "CNTT", "Pho thong");

        // Them sach tieu thuyet
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2000, 7, "Ky ao", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "Doraemon", "Fujiko F. Fujio", 1998, 12, "Hai huoc", true);

        // Them vao danh sach
        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);

        System.out.println("=== DANH SACH SACH BAN DAU ===");
        ql.hienThiDanhSach();

        System.out.println("\n--- Tim kiem sach co ma TT01 ---");
        System.out.println(ql.timKiem("TT01"));

        System.out.println("\n--- Cap nhat so luong cho GT02 ---");
        ql.capNhatSoLuong("GT02", 15);
        ql.hienThiDanhSach();

        System.out.println("\n--- Xoa sach co ma TT02 ---");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
