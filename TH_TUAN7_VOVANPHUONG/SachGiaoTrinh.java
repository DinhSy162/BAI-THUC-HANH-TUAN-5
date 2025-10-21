
package bt_tuan5;

class SachGiaoTrinh extends Sach implements IkiemKe{
    private String Monhoc;
    private String Capdo;
   
    
    public SachGiaoTrinh(String maSach,String tieuDe, String tacGia, int namXuatBan, int soluong, String Monhoc,String Capdo, double giacoban){
        
       super(maSach, tieuDe, tacGia, namXuatBan, soluong, giacoban); 
        this.Capdo = Capdo;
        this.Monhoc = Monhoc;   
        
    }
   public double tinhgiaban(){    
        int sonam =2025 - getNamXuatBan();
        return giacoban + sonam*5000;
    }
    @Override
    public String toString(){
        return super.toString()+ " Mon hoc  " +Monhoc+ " Cap do  " +Capdo+ " giaban  " +tinhgiaban();
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return getSoluong() >= soLuongToiThieu;
}
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + getTieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

   
}