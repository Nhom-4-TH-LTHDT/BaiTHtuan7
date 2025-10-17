public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + tieuDe + " đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "SachTieuThuyet{" +
                "tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", giaCoBan=" + giaCoBan +
                ", laSachSeries=" + laSachSeries +
                ", giaBan=" + tinhGiaBan() +
                '}';
    }
}
