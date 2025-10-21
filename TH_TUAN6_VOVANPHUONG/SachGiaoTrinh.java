
package bt_tuan5;

class SachGiaoTrinh extends Sach {
    private String Monhoc;
    private String Capdo;
    
    public SachGiaoTrinh(String maSach,String tieuDe, String tacGia, int namXuatBan, int soluong, String Monhoc,String Capdo){
        
       super(maSach, tieuDe, tacGia, namXuatBan, soluong); 
        this.Capdo = Capdo;
        this.Monhoc = Monhoc;     
    }
  
    @Override
    public String toString(){
        return super.toString()+ " Mon hoc " +Monhoc+ "Cap do " +Monhoc;
    }
        

   
}