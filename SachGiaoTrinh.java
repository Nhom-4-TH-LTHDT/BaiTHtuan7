public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;

    // Constructor cập nhật
    public SachGiaoTrinh(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        // Gọi constructor của lớp cha
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    //  Ghi đè phương thức trừu tượng tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        int namHienTai = 2025; // Giả định năm hiện tại là 2025
        int soNamDaXuatBan = namHienTai - getNamXuatBan();
        // Giá bán = giaCoBan + (Số năm đã xuất bản × 5.000 VNĐ)
        return getGiaCoBan() + (soNamDaXuatBan * 5000.0);
    }

    //  Triển khai giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Trả về true nếu soLuong của sách >= soLuongToiThieu
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        // In ra thông báo cập nhật vị trí
        System.out.println("Đã chuyển sách [" + getTieuDe() + "] đến khu vực: " + viTriMoi + ".");
    }

    // Cập nhật toString()
    @Override
    public String toString() {
        // Thêm thông tin monHoc và Giá bán tính toán được
        return super.toString() + ", Môn học: " + monHoc +
               ", Giá Bán Ước Tính: " + String.format("%,.0f VNĐ", tinhGiaBan());
    }
}