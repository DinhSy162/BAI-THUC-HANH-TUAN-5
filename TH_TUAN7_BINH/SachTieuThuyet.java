/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlisach;



public class SachTieuThuyet extends sach {
    private String theLoai;
    private boolean laSachSeries;

    // CONSTRUCTOR: 8 tham số
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        // Lời gọi SUPER: 6 tham số lớp cha
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan); 
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    // Triển khai phương thức trừu tượng tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        // Công thức: giaCoBan + (Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ, ngược lại cộng 0)
        double phuPhiSeries = this.laSachSeries ? 15000.0 : 0.0;
        return getGiaCoBan() + phuPhiSeries;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("===== SÁCH TIỂU THUYẾT =====");
        // Gọi lại phương thức lớp cha để in đủ 5 thuộc tính + Giá bán
        super.hienThiThongTin(); 
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Thuộc series: " + (laSachSeries ? "Có" : "Không"));
        System.out.println("============================");
    }
    
    @Override
    public String toString() {
        return super.toString(); 
    }
}