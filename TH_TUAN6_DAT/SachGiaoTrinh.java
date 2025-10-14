public class SachGiaoTrinh extends Sach {
    private final String monHoc;
    private final String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return ", Cap do: " +
                super.toString() +
                ", Mon hoc: " + monHoc + capDo;
    }
}