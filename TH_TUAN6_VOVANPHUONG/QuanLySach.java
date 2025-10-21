
package bt_tuan5;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhsach;
    
    public QuanLySach(){
       danhsach = new ArrayList<>();
    }
    // Thêm sách
    public void themSach(Sach s) {
        danhsach.add(s);
    }

    public void xoaSach(String ma) {
        danhsach.removeIf(s -> s.getMaSach().equalsIgnoreCase(ma));
        
        //s -> s.getMaSach()   với mỗi đối tượng sách s, lấy ra mã sách của nó.
    }

    public void capNhatSach(String ma, Sach sachMoi) {
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getMaSach().equalsIgnoreCase(ma)) {
                danhsach.set(i, sachMoi);
                break;
            }
        }
        //.equalsIgnoreCase(ma)) So sánh chuỗi mã sách vừa lấy được với chuỗi ma mà ta truyền vào, không phân biệt chữ hoa – chữ thường.
        //getMaSach() Gọi phương thức getter trong lớp Sach để lấy mã sách của phần tử đó
        //danhsach.get(i) Lấy phần tử thứ i trong danh sách
        //danhsach Là một ArrayList<Sach> chứa nhiều đối tượng Sach hoặc các lớp con SachGiaoTrinh, SachTieuThuyet
    }

    public Sach timKiem(String ma) {
        for (Sach s : danhsach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        // Sach s : danhsach  Lặp qua từng quyển sách trong danh sách danhsach, và mỗi lần lặp, gán quyển sách hiện tại cho biến s để thao tác với nó.
        return null;
    }

    public void hienThiDanhSach() {
        if (danhsach.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (Sach s : danhsach) {
                System.out.println(s.toString());
            }
        }
    }
}
