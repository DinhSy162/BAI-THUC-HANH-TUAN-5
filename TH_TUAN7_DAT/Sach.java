/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlisach;



// File: Sach.java
public abstract class sach { // Phải là abstract class
    // Thuộc tính (nên đổi thành private để đóng gói tốt hơn)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong; 
    
    // Thêm thuộc tính mới
    private double giaCoBan; // Giá cơ bản

    // Constructor mặc định (cần thiết)
    public sach() {
    }

    // CONSTRUCTOR CHÍNH (6 tham số) - Đây là constructor các lớp con phải gọi
    public sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan; // Gán giá cơ bản
    }

    // Constructor cũ 5 tham số (TÙY CHỌN - Nếu có thì phải set giaCoBan mặc định)
    // Nếu bạn muốn giữ lại constructor này cho sách "thường" (sẽ lỗi vì sach là abstract)
    // Tốt nhất là BỎ constructor 5 tham số này đi.

    // Getter và Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    
    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // Phương thức trừu tượng: Tính giá bán (bắt buộc phải có)
    public abstract double tinhGiaBan(); 

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong); 
        // Hiển thị Giá bán thông qua toString()
        System.out.println(this.toString());
    }
    
    // Phương thức toString() để hiển thị Giá bán
    @Override
    public String toString() {
        return "Giá bán: " + this.tinhGiaBan() + " VNĐ";
    }
}