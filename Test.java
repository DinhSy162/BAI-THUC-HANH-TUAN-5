
package bt_tuan5;


public class Test {
    public static void main(String[] args){
        Sach sach1 = new Sach("A123","Thiet ke web","Le Van A",2006,300);
        Sach sach2 = new Sach("A124","CSDL","nguyen thi B",2006,30);
        
        Sach sach3 = new Sach();
        sach3.setMaSach("a125");
        sach3.setTieuDe("Lap Trinh C");
        sach3.setTacGia("Hoang Thi My Le");
        sach3.setNamXuatBan(2003);
        sach3.setSoluong(200);
        
        sach1.hienthithongtin();
        sach2.hienthithongtin();
        sach3.hienthithongtin();
    }
    
}
