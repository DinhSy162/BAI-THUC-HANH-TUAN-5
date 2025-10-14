
public class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    @Override
    public String toString() {
        return ", So Luong: " +
                "Ma sach: " + maSach +
                ", Tieu de: " + tieuDe +
                ", Tac gia: " + tacGia +
                ", Nam XB: " + namXuatBan + soLuong;
    }
}