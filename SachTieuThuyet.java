public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    // Constructor cập nhật
    public SachTieuThuyet(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        // Gọi constructor của lớp cha
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    //  Ghi đè phương thức trừu tượng tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        double phuPhiSeries = laSachSeries ? 15000.0 : 0.0;
        // Giá bán = giaCoBan + (Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ, ngược lại cộng 0)
        return getGiaCoBan() + phuPhiSeries;
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
        String seriesInfo = laSachSeries ? " (Series)" : "";
        // Thêm thông tin laSachSeries và Giá bán tính toán được
        return super.toString() + ", TT: TTiểu Thuyết" + seriesInfo +
               ", Giá Bán Ước Tính: " + String.format("%,.0f VNĐ", tinhGiaBan());
    }
}