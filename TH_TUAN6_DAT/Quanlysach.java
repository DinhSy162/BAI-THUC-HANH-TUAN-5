
import java.util.ArrayList;

public class QuanLySach {
    private final ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xoá sách theo mã
    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    // Cập nhật (ví dụ cập nhật số lượng)
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.soLuong = soLuongMoi;
                break;
            }
        }
    }

    // Tìm kiếm theo mã sách
    public Sach timKiem(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}