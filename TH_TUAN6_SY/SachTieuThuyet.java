

public class SachTieuThuyet extends Sach {
    private final String theLoai;
    private final boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return (laSachSeries ? "Co" : "Khong") + super.toString() +
                ", The loai: " + theLoai +
                ", Series: ";
    }
}
