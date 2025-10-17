package VU_btaptuan7;
public class SachTieuThuyet extends Sach implements IKiemKe {
    private final String theLoai;
    private final boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double phuPhiSeries = this.laSachSeries ? 15000.0 : 0.0;
        return this.getGiaCoBan() + phuPhiSeries;
    }

    @Override
    public String toString() {
        String seriesStatus = laSachSeries ? "Có" : "Không";
        return super.toString() +
               "\nThể loại: " + theLoai +
               "\nLà sách series: " + seriesStatus +
               "\nGiá Bán Ước Tính: " + String.format("%,.0f VNĐ", this.tinhGiaBan());
    }
    
    @Override
    public void hienThiThongTin() {
        System.out.println("--- THÔNG TIN SÁCH TIỂU THUYẾT ---");
        System.out.println(this.toString());
        System.out.println("---------------------------------");
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + this.getTieuDe() + " đến khu vực: " + viTriMoi + ".");
    }
}
