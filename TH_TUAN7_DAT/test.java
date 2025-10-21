
package com.mycompany.quanlisach;


public class test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số (đã thêm giaCoBan)
        // LỖI ĐÃ SỬA: Thay new sach(...) bằng new SachTieuThuyet(...)
        SachTieuThuyet sach1 = new SachTieuThuyet("B001", "Lập trình Java", "Nguyễn Văn A", 2022, 5, 80000.0, "Công nghệ", false); 
        SachTieuThuyet sach2 = new SachTieuThuyet("B002", "Cơ sở dữ liệu", "Trần Thị B", 2022, 3, 95000.0, "Công nghệ", false);

        // Gọi phương thức hiển thị
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        // Tạo sách bằng constructor mặc định + setter
        // DÙNG LỚP CON để khởi tạo sách "thường" (sach3)
        sach sach3 = new SachTieuThuyet("B003", "Cấu trúc dữ liệu", "Lê Văn C", 2020, 10, 50000.0, "Học thuật", false);
        sach3.hienThiThongTin();

        // --- PHẦN QUẢN LÝ SÁCH ---
        System.out.println("\n===== PHẦN QUẢN LÝ SÁCH =====");
        QuanLySach ql = new QuanLySach();

        // Thêm các sách cơ bản vào danh sách quản lý
        ql.themSach(sach1);
        ql.themSach(sach2);
        ql.themSach(sach3);

        // Thêm các loại sách khác (Sách giáo trình & tiểu thuyết)
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT001", "Nhập môn lập trình", "Nguyễn Văn D", 2021, 15, 120000.0, "CNTT", "Đại học");
        SachTieuThuyet tth = new SachTieuThuyet("TT001", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 1950, 20, 75000.0, "Thiếu nhi", true); 

        ql.themSach(sgk);
        ql.themSach(tth);

        // Hiển thị danh sách tất cả sách
        System.out.println("\n--- Danh sách các sách hiện có ---");
        ql.hienThiDanhSach();

        // Tìm kiếm theo mã
        System.out.println("\nTìm sách có mã GT001:");
        sach timThay = ql.timKiemTheoMa("GT001");
        if (timThay != null) timThay.hienThiThongTin();
        else System.out.println("Không tìm thấy sách!");

        // Cập nhật thông tin sách
        System.out.println("\nCập nhật thông tin sách B002...");
        // Khởi tạo LỚP NẶC DANH (Anonymous Class) để thay thế sách B002
        ql.capNhatSach("B002", new sach("B002", "Cơ sở dữ liệu nâng cao", "Trần Thị B", 2023, 8, 110000.0) {
             // Cần triển khai phương thức abstract tinhGiaBan() ngay tại đây
             @Override
             public double tinhGiaBan() {
                 return getGiaCoBan() * 1.1; // Công thức tùy ý cho sách thường
             }
        });

        // Hiển thị lại danh sách sau cập nhật
        System.out.println("\n--- Danh sách sau khi cập nhật ---");
        ql.hienThiDanhSach();

        // Xóa sách
        System.out.println("\nXóa sách có mã B003...");
        ql.xoaSach("B003");

        // Hiển thị danh sách sau khi xóa
        System.out.println("\n--- Danh sách sau khi xóa ---");
        ql.hienThiDanhSach();
    }
}