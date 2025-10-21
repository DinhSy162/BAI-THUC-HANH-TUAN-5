
package bt_tuan5;


public class Test {
    public static void main(String[] args){
       
        QuanLySach ql = new QuanLySach();

        Sach s1 = new SachGiaoTrinh("GT01", "lap trinh java", "nguyen van ", 2020, 100, "cong nghe thong tin", "dai hoc",120000);
        Sach s2 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2005, 200, "ky ao", true,120000);
        Sach s3 = new SachTieuThuyet("TT02", "djgodjd", "Rosie", 2018, 150, "tam ly", false,120000);

        // Thêm sách
        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);

        System.out.println("--- Danh sach hien tai ---");
        ql.hienThiDanhSachsach();

        // Tìm kiếm
        System.out.println(" tim sach co ma TT01");
        System.out.println(ql.timKiem("TT01"));

        // Cập nhật
        ql.capNhatSach("TT02", new SachTieuThuyet("TT02", "Tuo tre dang gia bao nhieu", "Rosie Nguyen", 2018, 180, "Tam ly", false,5000));

        System.out.println(" danh sach sau khi cap nhap");
        ql.hienThiDanhSachsach();

        // Xóa
        ql.xoaSach("GT01");

        System.out.println("danh sach sau khi xoa");
        ql.hienThiDanhSachsach();
        
        System.out.println("--- Kiem tra interface ---");
        
        IkiemKe kiemKeGiaoTrinh = (IkiemKe) s1;
        int soLuongCan = 100;
        boolean duTonKho = kiemKeGiaoTrinh.kiemTraTonKho(soLuongCan);
        System.out.print("Kiem tra ton kho sach Giao Trinh (So luong >=" + soLuongCan + "): ");
        System.out.println(duTonKho ? "Đu ton kho." : " Khong đu ton kho."); 
        kiemKeGiaoTrinh.capNhatViTri("Kho A1-Ke 5");
        
        IkiemKe kiemKeTieuThuyet =(IkiemKe) s2; 
        System.out.print("Kiem tra ton kho sach Tieu Thuyet (So luong >=" + soLuongCan + "): ");
        System.out.println(kiemKeTieuThuyet.kiemTraTonKho(soLuongCan) ? " du ton kho." : "Khong đu ton kho.");
        kiemKeTieuThuyet.capNhatViTri("Kho A3-Ke 10");
    }
    
    
}
