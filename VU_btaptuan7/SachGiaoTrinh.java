package VU_btaptuan7;
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private final String monHoc;
    private final String capDo;
    private static final int NAM_HIEN_TAI = 2025;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = NAM_HIEN_TAI - this.getNamXuatBan();
        return this.getGiaCoBan() + (soNamDaXuatBan * 5000.0);
    }
    
    public String getMonHoc() {
        return monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMôn học: " + monHoc +
               "\nCấp độ: " + capDo +
               "\nGiá Bán Ước Tính: " + String.format("%,.0f VNĐ", this.tinhGiaBan());
    }
    
    @Override
    public void hienThiThongTin() {
        System.out.println("--- THÔNG TIN SÁCH GIÁO TRÌNH ---");
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
