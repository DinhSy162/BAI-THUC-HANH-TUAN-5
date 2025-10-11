
package bt_tuan5;

class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean lasachSerise;
    
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,int soluong, String theLoai,boolean lasachSerise){
        
        super( maSach, tieuDe, tacGia, namXuatBan, soluong);
        this.theLoai = theLoai;
        this.lasachSerise = lasachSerise;          
    }
    @Override
    public String toString(){
        return super.toString() +", the loai: " + theLoai + ", La sach series: " + (lasachSerise ? "co" : "khong");
        
    }
    
}
