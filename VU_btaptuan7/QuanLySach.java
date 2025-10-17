/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sach;

/**
 *
 * @author OS
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class QuanLySach {
    private final List<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        this.danhSachSach.add(sach);
        System.out.println("Đã thêm sách thành công: " + sach.getTieuDe());
    }

    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách hiện đang trống.");
            return;
        }
        System.out.println("\n===== DANH SÁCH TẤT CẢ SÁCH =====");
        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
        }
        System.out.println("==================================");
    }

    public Sach timKiemSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    public boolean xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSachSach.iterator();
        while (iterator.hasNext()) {
            Sach sach = iterator.next();
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                System.out.println("Đã xóa sách có mã " + maSach + ".");
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã " + maSach + " để xóa.");
        return false;
    }

    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            System.out.println("Đã cập nhật số lượng sách " + maSach + " thành " + soLuongMoi);
            return true;
        }
        System.out.println("Không tìm thấy sách có mã " + maSach + " để cập nhật.");
        return false;
    }
}
