
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

        
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println(" tim sach co ma TT01");
        System.out.println(ql.timKiem("TT01"));

        // Cập nhật
        ql.capNhatSach("TT02", new SachTieuThuyet("TT02", "Tuo tre dang gia bao nhieu", "Rosie Nguyen", 2018, 180, "Tam ly", false,5000));

        System.out.println(" danh sach sau khi cap nhap");
        ql.hienThiDanhSach();

        // Xóa
        ql.xoaSach("GT01");

        System.out.println("danh sach sau khi xoa");
        ql.hienThiDanhSach();
    }
    
    
}
