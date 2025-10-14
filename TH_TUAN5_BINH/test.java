/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thtuan5;

/**
 *
 * @author BINH
 */

public class test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        sach sach1 = new sach("B001", "Lập trình Java", "Nguyễn Văn A", 2022);
        sach sach2 = new sach("B002", "Cơ sở dữ liệu", "Trần Thị B", 2022);

        // Gọi phương thức hiển thị
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        // Tạo sách bằng constructor mặc định + setter
        sach sach3 = new sach();
        sach3.setMaSach("B003");
        sach3.setTieuDe("Cấu trúc dữ liệu");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2020);

        sach3.hienThiThongTin();
    }
}

    

