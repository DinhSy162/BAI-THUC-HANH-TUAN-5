/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlisach;


public class SachGiaoTrinh extends sach { 
    private String monHoc;
    private String capDo;

    // CONSTRUCTOR: Cần đủ 8 tham số và gọi super() với 6 tham số lớp cha
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan); // Gọi constructor lớp cha
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    // Triển khai phương thức trừu tượng tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        // Công thức: giaCoBan + (Số năm đã xuất bản x 5.000 VNĐ)
        int namHienTai = 2025;
        int soNamDaXuatBan = namHienTai - getNamXuatBan();
        
        // Đảm bảo số năm không âm nếu namXuatBan > namHienTai
        if (soNamDaXuatBan < 0) soNamDaXuatBan = 0; 
        
        return getGiaCoBan() + (soNamDaXuatBan * 5000.0);
    }

    // Phương thức hiển thị thông tin
    @Override
    public void hienThiThongTin() {
        System.out.println("===== SÁCH GIÁO TRÌNH =====");
        // Gọi lại phương thức lớp cha để in đủ 5 thuộc tính + Giá bán (qua toString)
        super.hienThiThongTin(); 
        System.out.println("Môn học: " + monHoc);
        System.out.println("Cấp độ: " + capDo);
        System.out.println("===========================");
    }
    
    // Phương thức toString()
    @Override
    public String toString() {
        return super.toString(); 
    }
}