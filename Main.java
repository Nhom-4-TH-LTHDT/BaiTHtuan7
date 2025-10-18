public class Main {
    public static void main(String[] args) {
        // Khởi tạo lớp quản lý
        QuanLySach qlSach = new QuanLySach();

        //  Yêu cầu 4: Tạo đối tượng và thêm vào quản lý

        // 1. Tạo đối tượng SachGiaoTrinh (ra đời năm 2020)
        SachGiaoTrinh s1 = new SachGiaoTrinh("GT001", "Toán Cao Cấp A1", 2020, 150, 80000.0, "Toán");
        qlSach.themSach(s1);

        // 2. Tạo đối tượng SachTieuThuyet (Không series)
        SachTieuThuyet s2 = new SachTieuThuyet("TT001", "Hồn Ma Thành Phố", 2024, 80, 120000.0, false);
        qlSach.themSach(s2);
        
        // 3. Tạo đối tượng SachTieuThuyet (Có series)
        SachTieuThuyet s3 = new SachTieuThuyet("TT002", "Dòng Máu Lạc Hồng - Tập 5", 2025, 200, 150000.0, true);
        qlSach.themSach(s3);


        // 🧪 Yêu cầu 4: Gọi hienThiDanhSachSach() để kiểm tra kết quả tính giá
        System.out.println("--- KIỂM TRA TÍNH TRỪU TƯỢNG (GIÁ BÁN) ---");
        qlSach.hienThiDanhSachSach();
        // Giá bán s1 (2025 - 2020 = 5 năm): 80.000 + (5 * 5.000) = 105.000 VNĐ
        // Giá bán s2 (Không series): 120.000 + 0 = 120.000 VNĐ
        // Giá bán s3 (Có series): 150.000 + 15.000 = 165.000 VNĐ


        // 🎯 Yêu cầu 4: Thực hiện kiểm tra giao diện IKiemKe
        System.out.println("\n--- KIỂM TRA GIAO DIỆN IKiemKe ---");

        // Tạo một đối tượng IKiemKe tham chiếu đến một đối tượng SachGiaoTrinh
        IKiemKe kiemKeGiaoTrinh = s1; // Hoặc new SachGiaoTrinh(...)
        
        // 1. Kiểm tra tồn kho
        int soLuongCan = 100;
        boolean duTonKho = kiemKeGiaoTrinh.kiemTraTonKho(soLuongCan);
        System.out.println("Sách [" + s1.getTieuDe() + "] có " + s1.getSoLuong() + " cuốn.");
        System.out.println("Kiểm tra tồn kho (>= " + soLuongCan + "): " + duTonKho); // Kết quả: true (150 >= 100)

        // 2. Cập nhật vị trí
        kiemKeGiaoTrinh.capNhatViTri("Kho A1-Kệ 5");

        // 3. Kiểm tra tương tự với SachTieuThuyet
        IKiemKe kiemKeTieuThuyet = s2;
        kiemKeTieuThuyet.capNhatViTri("Kho B2-Kệ 12");
    }
}