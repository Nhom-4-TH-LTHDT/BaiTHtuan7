import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    // Phương thức hiển thị danh sách sách
    public void hienThiDanhSachSach() {
        System.out.println("\n--- DANH SÁCH SÁCH HIỆN CÓ ---");
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Sach sach : danhSachSach) {
            // Sử dụng toString đã được cập nhật ở lớp con để in ra đầy đủ thông tin
            // bao gồm cả Giá Bán Ước Tính (tinhGiaBan())
            System.out.println(sach);
        }
    }
}