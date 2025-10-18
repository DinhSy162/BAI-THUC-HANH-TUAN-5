
package bt_tuan5;

class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean lasachSerise;
    
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,int soluong, String theLoai,boolean lasachSerise, double giacoban){
        
        super( maSach, tieuDe, tacGia, namXuatBan, soluong, giacoban);
        this.theLoai = theLoai;
        this.lasachSerise = lasachSerise;          
    }
    public double giaban(){
        return giacoban + (lasachSerise ? 15000 : 0);
    }
    
    @Override
    public String toString(){
        return super.toString() +", the loai: " + theLoai + ", La sach series: " + (lasachSerise ? " co " : " khong ")+ ",giaban " +giaban();
        
    }
    
}
