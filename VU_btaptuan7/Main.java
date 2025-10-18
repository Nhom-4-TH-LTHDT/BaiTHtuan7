public class Main {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sgk = new SachGiaoTrinh("Toán Cao Cấp", "Nguyễn Văn A", 2018, 120, 85000);
        SachTieuThuyet stt = new SachTieuThuyet("Harry Potter", "J.K. Rowling", 2020, 50, 120000, true);

        ql.themSach(sgk);
        ql.themSach(stt);

        ql.hienThiDanhSachSach();

        // Kiểm tra giao diện
        IKiemKe kiemKe = sgk;
        System.out.println("Kiểm tra tồn kho: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1-Kệ 5");
    }
}
